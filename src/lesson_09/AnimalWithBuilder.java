package lesson_09;

import javafx.util.Builder;

public class AnimalWithBuilder {

    public String name;
    private int speed;
    private boolean isWithWings;

    protected AnimalWithBuilder(Builder builder){
        this.name = builder.name;
        this.speed = builder.speed;
        this.isWithWings = builder.isWithWings;
    }

    //read-only

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isWithWings() {
        return isWithWings;
    }


    //inner class

    public static class Builder{

        public AnimalWithBuilder build(){
            return new AnimalWithBuilder(this);
        }

        private String name;
        private int speed;
        private boolean isWithWings;

        //write only
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSpeed(int speed) {
            this.speed = speed;
            return this;
        }

        public Builder setWithWings(boolean isWithWings) {
            this.isWithWings = isWithWings;
            return this;
        }

    }



}
