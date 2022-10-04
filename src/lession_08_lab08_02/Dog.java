package lession_08_lab08_02;

import java.security.SecureRandom;

public class Dog extends Animal{

    @Override
    public int getSpeed() {
        int dogSpeed = new SecureRandom().nextInt(60);
        return dogSpeed;
    }
}
