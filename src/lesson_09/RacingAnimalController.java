package lesson_09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static  lesson_09.AnimalWithBuilder.Builder;



public class RacingAnimalController {

    private static int maxSpeed;
    private static String winnerName;

    public static void main(String[] args) {
        Builder builder = new Builder();
        AnimalWithBuilder falcon= builder.setName("falcon").setSpeed(100).setWithWings(true).build();
        AnimalWithBuilder tiger= builder.setName("tiger").setSpeed(90).setWithWings(false).build();
        AnimalWithBuilder dog= builder.setName("dog").setSpeed(55).setWithWings(false).build();
        AnimalWithBuilder snake= builder.setName("snake").setSpeed(40).setWithWings(false).build();

        List<AnimalWithBuilder> animalList = new ArrayList<>();
        animalList.add(falcon);
        animalList.add(tiger);
        animalList.add(dog);
        animalList.add(snake);

        List<AnimalWithBuilder> raceAnimalList = new ArrayList<>();

        for (int i = 0; i<animalList.size();i++){
            if(animalList.get(i).isWithWings()==false){
                raceAnimalList.add(animalList.get(i));
            }
        }
        maxSpeed = raceAnimalList.get(0).getSpeed();
        winnerName = raceAnimalList.get(0).getName();
        for (int i = 0; i <raceAnimalList.size();i++){
            if(maxSpeed<raceAnimalList.get(i).getSpeed()){
                maxSpeed = raceAnimalList.get(i).getSpeed();
                winnerName = raceAnimalList.get(i).getName();
            }
        }

        System.out.println("winner is: "+winnerName + " with speed: "+maxSpeed);

    }
}
