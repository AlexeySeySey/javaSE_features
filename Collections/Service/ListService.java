package Service;

import Lambda.IServiceMapClosure;
import Item.BaseItem;
import java.util.ArrayList;
import java.util.Collections;
import Comparator.ItemComparator;

public class ListService<T extends BaseItem> {

    private ArrayList<T> collection;

    public ListService(ArrayList<T> collection) {
        this.collection = collection;
    }

    public ListService sort() {
        Collections.sort(this.collection, new ItemComparator());

        return this;
    }

    public ListService reverse() {
        Collections.reverse(this.collection);

        return this;
    }

    public ListService map(IServiceMapClosure closure) {
        for (Object item : this.collection) {
            closure.handle((BaseItem)item);
        }
        return this;
    }

    public ArrayList<T> getCollection() {
        return this.collection;
    }
}