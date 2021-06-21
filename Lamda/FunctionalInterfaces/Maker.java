package FunctionalInterfaces;

@FunctionalInterface
public interface Maker<T> {
    String make(T something);

}

