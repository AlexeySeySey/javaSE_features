package DTO;

import Contract.IDTO;

public final class RequestDTO implements IDTO {

    private String key;

    private String body;

    public RequestDTO(String key, String body) {
        this.key = key;
        this.body = body;
    }

    public String getKey() {
        return this.key;
    }

    public String getBody() {
        return this.body;
    }

    public String toString() {
        return String.format("Key: %s\nBody: %s", this.key, this.body);
    }
}