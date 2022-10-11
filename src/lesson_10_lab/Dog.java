package lesson_10_lab;

import java.security.SecureRandom;

public class Dog extends Animal{

    static final int DOG_MAX_SPEED = 60;
    public Dog(String name) {
        super(name, new SecureRandom().nextInt(DOG_MAX_SPEED));
    }

    @Override
    public int race() {
        return speed;
    }
}
