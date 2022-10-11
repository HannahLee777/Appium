package lesson_10_lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RacingAnimal {

    private static int maxSpeed;
    private static String winnerName;

    public static void main(String[] args) {
        Animal dog = new Dog("dog");
        Animal tiger = new Tiger("tiger");
        Animal horse = new Horse("horse");

        List<Animal> animalList = new ArrayList<>();
        animalList.add(dog);
        animalList.add(tiger);
        animalList.add(horse);

        maxSpeed = animalList.get(0).race();
        winnerName = animalList.get(0).name;
        for (int i = 0; i<animalList.size();i++){
            if(maxSpeed<animalList.get(i).race()){
                maxSpeed = animalList.get(i).race();
                winnerName = animalList.get(i).name;
            }
        }
        System.out.println("winner is: " +winnerName+ " with speed: "+maxSpeed);
    }

}
