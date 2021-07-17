package Item;

public abstract class BaseItem<T, C> {

    protected T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return this.value;
    }

    public abstract int compareTo(C item);
}