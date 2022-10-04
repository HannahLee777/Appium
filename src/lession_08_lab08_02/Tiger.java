package lession_08_lab08_02;

import java.security.SecureRandom;

public class Tiger extends Animal{

    @Override
    public int getSpeed() {
        int tigerSpeed = new SecureRandom().nextInt(100);
        return tigerSpeed;
    }
}
