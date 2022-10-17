package lesson_11_lab;

import java.security.SecureRandom;

public class Eagle extends Animal implements MoveAble,Flyable{

    static final int EAGLE_MAX_SPEED = 100;
    public Eagle(String name) {
        super(name, new SecureRandom().nextInt(EAGLE_MAX_SPEED));
    }
    @Override
    public int move() {
        return speed;
    }

    @Override
    public boolean fly() {
        return true;
    }

}
