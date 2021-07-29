package Contract.Lambda;

@FunctionalInterface
public interface Maker<T> {
    String make(T something);
}

