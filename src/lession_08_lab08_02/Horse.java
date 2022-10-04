package lession_08_lab08_02;

import java.security.SecureRandom;

public class Horse extends Animal{

    @Override
    public int getSpeed() {
        int horseSpeed = new SecureRandom().nextInt(75);
        return horseSpeed;
    }
}
