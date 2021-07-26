package Contract.Lambda;

@FunctionalInterface
public interface FileLineReaderClosure {
    public void handle(String line);
}