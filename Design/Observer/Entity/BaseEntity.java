package Entity;

import Contract.IObserve;
import java.util.HashSet;

public abstract class BaseEntity {

    protected HashSet<IObserve> observers = new HashSet<IObserve>();

    protected void attach(IObserve observer) {
        this.observers.add(observer);
    }

    protected void detach(IObserve observer) {
        this.observers.remove(observer);
    }

    protected void notifyObservers() {
        for (IObserve observer : this.observers) {
            observer.observe(this);
        }
    }
}