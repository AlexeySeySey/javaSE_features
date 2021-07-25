package Entity;

public final class User {

    private String name;

    private String email;

    public User setName(String name) {
        this.name = name;

        return this;
    }

    public String getName() {
        return this.name;
    }

    public User setEmail(String email) {
        this.email = email;

        return this;
    }

    public String getEmail() {
        return this.email;
    }

    public String toString() {
        return String.format("User name: %s, User email: %s", this.name, this.email);
    }
}