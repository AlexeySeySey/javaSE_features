package Factory;

import Util.Faker;
import Entity.User;
import Contract.IFactory;

public final class UserFactory implements IFactory<User> {

    @Override
    public User make() {

        var faker = new Faker();

        String randomString = faker.getRandomString();

        User user = new User();
        user.setName(randomString);
        user.setEmail(randomString + "@gmail.com");

        return user;
    }
}