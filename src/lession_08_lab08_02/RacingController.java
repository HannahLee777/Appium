package lession_08_lab08_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RacingController {

    public List<Integer> winnerSpeedList(List<Animal> animalList) {

        List<Integer> winnerSpeedlList = new ArrayList<>();

        for (Animal animal : animalList) {
                int winnerSpeed = animal.getSpeed();
                winnerSpeedlList.add(winnerSpeed);
        }
            return winnerSpeedlList;
    }


    private static int maxSpeed;
    private static String winnerName;

    public static void main(String[] args) {
        Horse horse = new Horse();
        Tiger tiger = new Tiger();
        Dog dog = new Dog();
        List<Animal> animalList = Arrays.asList(horse,tiger,dog);
        List<Integer> winnerSpeedList = new RacingController().winnerSpeedList(animalList);

        System.out.println(winnerSpeedList);
        maxSpeed = winnerSpeedList.get(0);
        winnerName = animalList.get(0).getClass().getSimpleName();

        for (int i = 0; i <winnerSpeedList.size(); i++) {
            if (maxSpeed < winnerSpeedList.get(i)) {
                maxSpeed = winnerSpeedList.get(i);
                winnerName = animalList.get(i).getClass().getSimpleName();
            }
        }
        System.out.println("Winner is: " + winnerName + " with speed: " + maxSpeed);
    }
}
