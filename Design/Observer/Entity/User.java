package Entity;

import Observer.LoggingObserver;
import Entity.BaseEntity;

public final class User extends BaseEntity {

    private String name;

    public User() {
        this.attach(new LoggingObserver());
    }

    public User setName(String name) {
        this.name = name;
        this.notifyObservers();
        return this;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return String.format("User name: %s", this.name);
    }
}