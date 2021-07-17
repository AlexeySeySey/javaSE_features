package Service;

import Lambda.IServiceMapClosure;
import java.util.Iterator;
import Item.BaseItem;
import java.util.ArrayDeque;

public class DequeService<T extends BaseItem> {

    private ArrayDeque<T> collection;

    private Iterator iterator;

    public DequeService(ArrayDeque<T> collection) {
        this.collection = collection;
        this.iterator = this.collection.descendingIterator();
    }

    public DequeService fromEnd() {
        this.iterator = this.collection.iterator();

        return this;
    }

    public DequeService fromStart() {
        this.iterator = this.collection.descendingIterator();

        return this;
    }

    public DequeService map(IServiceMapClosure closure) {
        while (this.iterator.hasNext()) {
            closure.handle(
                    (BaseItem) iterator.next()
            );
        }
        return this;
    }

    public ArrayDeque<T> getCollection() {
        return this.collection;
    }
}