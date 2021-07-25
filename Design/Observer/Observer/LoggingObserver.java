package Observer;

import Contract.IObserve;
import Entity.BaseEntity;

public final class LoggingObserver implements IObserve {
    public void observe(BaseEntity entity) {
        System.out.println("Logging something about: " + entity);
    }
}