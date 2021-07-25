package DTO;

public final class RequestDTO {

    private String type;

    private String body;

    public RequestDTO(String type, String body) {
        this.type = type;
        this.body = body;
    }

    public String getType() {
        return this.type;
    }

    public String getBody() {
        return this.body;
    }

    public String toString() {
        return String.format(
                "Request type: %s, Request body: %s",
                this.type,
                this.body
        );
    }
}