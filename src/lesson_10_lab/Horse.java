package lesson_10_lab;

import java.security.SecureRandom;

public class Horse extends Animal {

    static final int HORSE_MAX_SPEED = 75;
    public Horse(String name) {
        super(name, new SecureRandom().nextInt(HORSE_MAX_SPEED));
    }

    @Override
    public int race() {
        return speed;
    }
}
