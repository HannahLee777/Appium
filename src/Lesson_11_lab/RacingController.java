package Lesson_11_lab;

import lesson_09.AnimalWithBuilder;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class RacingController {

    private static int maxSpeed;
    private static String winnerName;

    public static void main(String[] args) {
        Animal dog = new Dog("dog");
        Animal eagle = new Eagle("eagle");
        Animal horse = new Horse("horse");
        Animal tiger = new Eagle("tiger");


        List<Animal> animalList = new ArrayList<>();
        animalList.add(dog);
        animalList.add(eagle);
        animalList.add(horse);
        animalList.add(tiger);

        List<Animal> raceAnimalList = new ArrayList<>();

        boolean checkAnimalListNo = animalList.isEmpty();

        if(checkAnimalListNo == true){
            System.out.println("No animal is adding to the animal list");
        }
        else {

            for (int i = 0; i < animalList.size(); i++) {
                if (animalList.get(i).fly() == false) {
                    raceAnimalList.add(animalList.get(i));
                }
            }
        }
        maxSpeed = raceAnimalList.get(0).move();
        winnerName = raceAnimalList.get(0).name;

        boolean checkRaceAnimalListNo = animalList.isEmpty();

        if(checkRaceAnimalListNo==true){
            System.out.println("No animal is able to attend the race ");
        }
        else {
            for (int i = 0; i < raceAnimalList.size(); i++) {
                if (maxSpeed < raceAnimalList.get(i).move()) {
                    maxSpeed = raceAnimalList.get(i).move();
                    winnerName = raceAnimalList.get(i).name;
                }
            }
        }
        System.out.println("winner is: " +winnerName+ " with speed: "+maxSpeed);
    }
}
