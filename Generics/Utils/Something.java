package Utils;

public class Something<T> {
    private T data;

    public Something<T> setData(T data) {
        this.data = data;

        return this;
    }

    public T getData() {
        return this.data;
    }
}
