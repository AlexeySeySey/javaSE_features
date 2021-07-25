package DTO;

public final class DataDTO {

    private String data;

    public DataDTO(String data) {
        this.data = data;
    }

    public String getData() {
        return this.data;
    }

    public String toString() {
        return String.format("Data: %s", this.data);
    }
}