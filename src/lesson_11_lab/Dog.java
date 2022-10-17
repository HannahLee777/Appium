package lesson_11_lab;

import java.security.SecureRandom;

public class Dog extends Animal implements MoveAble, Flyable {

    static final int DOG_MAX_SPEED = 60;
    public Dog(String name) {
        super(name, new SecureRandom().nextInt(DOG_MAX_SPEED));
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
