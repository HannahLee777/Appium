package lesson_02;

import java.util.Scanner;

public class lab2_1and2_3 {
    public static void main(String[] args) {

        Scanner scannerHeight = new Scanner(System.in);
        System.out.println("Please enter your height in m:");
        double height = scannerHeight.nextDouble();

        Scanner scannerWeight = new Scanner(System.in);
        System.out.println("Please enter your weight in kg:");
        double weight = scannerWeight.nextDouble();

        double BMI = Math.round((weight / (height * 2))*10.0)/10.0;

        double minIdealWeight = 18.5 * height * 2;

        double maxIdealWeight = 24.9 * height * 2;

        double moreWeight = Math.round((minIdealWeight - weight)*10.0)/10.0;

        double lessWeight = Math.round((weight - maxIdealWeight)*10.0)/10.0;

        System.out.println(" Your BMI is: " + BMI);

        if (BMI > 30) {

            System.out.println("You are Obesity, you should loose at least " + lessWeight + " kg");

        } else if (BMI >= 25) {

            System.out.println(" You are overweight, you should loose at least " + lessWeight + " kg");

        } else if (BMI >= 18.5) {

            System.out.println(" You are normal weight");

        } else {

            System.out.println(" You are underweight, you should gain " + moreWeight + " 1.6kg more");

        }
    }

}
