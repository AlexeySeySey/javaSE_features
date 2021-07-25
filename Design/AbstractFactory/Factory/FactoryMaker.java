package Factory;

import Contract.IFactory;
import Factory.UserFactory;
import Factory.ProductFactory;

public final class FactoryMaker {

    public IFactory get(String factory) throws Exception {
        return (IFactory) Class
                .forName(String.format("Factory.%sFactory", factory))
                .newInstance();
    }
}