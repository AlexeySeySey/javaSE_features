package Constant;

public enum ErrorMessage {

    UNHANDLEABLE_REUQEST("Request cannot be handled"),
    INVALID_REQUEST("Request is invalid");

    private String data;

    ErrorMessage(String data) {
        this.data = data;
    }

    public String get() {
        return this.data;
    }
}