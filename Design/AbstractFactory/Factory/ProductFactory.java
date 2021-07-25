package Factory;

import Entity.Product;
import Contract.IFactory;
import Util.Faker;

public final class ProductFactory implements IFactory<Product> {

    @Override
    public Product make() {

        var faker =  new Faker();

        Product product = new Product();
        product.setTitle(faker.getRandomString());
        product.setRating(faker.getRandomInt());

        return product;
    }
}