package lesson_11_lab;

public abstract class Animal {
    public String name;
    public int speed;

    public Animal(String name, int speed){
        this.name = name;
        this.speed = speed;
    }

    public abstract int move();
    public abstract boolean fly();

}
