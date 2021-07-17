package Comparator;

import java.util.Comparator;
import Item.BaseItem;

public final class ItemComparator implements Comparator<BaseItem> {
    public int compare(BaseItem prev, BaseItem next) {
        return prev.compareTo(next);
    }
}