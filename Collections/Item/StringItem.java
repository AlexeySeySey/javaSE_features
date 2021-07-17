package Item;

import Item.BaseItem;

public final class StringItem extends BaseItem<String, StringItem> {

    public StringItem(String value) {
        this.value = value;
    }

    @Override
    public int compareTo(StringItem item) {
        return this.value.length() > item.getValue().length() ? 1 : 0;
    }
}