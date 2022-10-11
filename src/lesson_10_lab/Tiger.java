package lesson_10_lab;

import java.security.SecureRandom;

public class Tiger extends Animal {

    static final int TIGER_MAX_SPEED = 100;
    public Tiger(String name) {
        super(name, new SecureRandom().nextInt(TIGER_MAX_SPEED));
    }

    @Override
    public int race() {
        return speed;
    }
}
