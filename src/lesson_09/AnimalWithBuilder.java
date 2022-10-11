package lesson_09;

import javafx.util.Builder;

public class AnimalWithBuilder {

    public String name;
    private int speed;
    private boolean withWings;

    protected AnimalWithBuilder(Builder builder){
        this.name = builder.name;
        this.speed = builder.speed;
        this.withWings = builder.withWings;
    }

    //read-only

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isWithWings() {
        return withWings;
    }


    //inner class

    public static class Builder{

        public AnimalWithBuilder build(){
            return new AnimalWithBuilder(this);
        }

        private String name;
        private int speed;
        private boolean withWings;

        //write only
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSpeed(int speed) {
            this.speed = speed;
            return this;
        }

        public Builder setWithWings(boolean withWings) {
            this.withWings = withWings;
            return this;
        }
    }



}
