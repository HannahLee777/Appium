package lesson_10_lab;

public abstract class Animal {

    public String name;
    public int speed;

    public Animal(String name, int speed){
        this.name = name;
        this.speed = speed;
    }

    //method
    public abstract int race();

}
