package Util;

import java.util.UUID;
import java.util.Random;

public final class Faker {

    public String getRandomString() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    public int getRandomInt() {
        int randomNumber = (new Random()).nextInt(100);
        randomNumber += 1;
        return randomNumber;
    }
}