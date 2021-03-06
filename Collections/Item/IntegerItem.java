package Item;

import Item.BaseItem;

public final class IntegerItem extends BaseItem<Integer, IntegerItem>  {

    public IntegerItem(Integer value) {
        this.value = value;
    }

    @Override
    public int compareTo(IntegerItem item) {
        var x = this.value.intValue();
        var y = item.getValue().intValue();

        return (x < y) ? -1 : ((x == y) ? 0 : 1);
    }

    public String toString() {
        return this.value.toString();
    }
}