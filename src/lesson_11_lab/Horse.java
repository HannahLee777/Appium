package lesson_11_lab;

import java.security.SecureRandom;

public class Horse extends Animal implements MoveAble, Flyable {

    static final int HORSE_MAX_SPEED = 80;
    public Horse(String name) {
        super(name, new SecureRandom().nextInt(HORSE_MAX_SPEED));
    }
    @Override
    public int move() {
        return speed;
    }

    @Override
     public boolean fly() {
        return false;
    }
}
