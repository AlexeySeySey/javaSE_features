package Contracts;

public interface IMaker {
    public final String defaultStuff = "Some Stuff";

    default String make() {
        return this.defaultStuff;
    }
}
