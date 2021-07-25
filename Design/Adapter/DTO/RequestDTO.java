package DTO;

public final class RequestDTO {

    private String foo;

    private String bar;

    public RequestDTO(String foo, String bar) {
        this.foo = foo;
        this.bar = bar;
    }

    public String getFoo() {
        return this.foo;
    }

    public String getBar() {
        return this.bar;
    }
}