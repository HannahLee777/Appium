package lesson_02;

import java.util.Scanner;

public class lab2_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        int number = scanner.nextInt();

        int remainder = number % 2;

        System.out.println(remainder);

        if (remainder == 0) {
            System.out.println(number + " is an even number");
        } else {
            System.out.println(number + " is an odd number");
        }
    }
}
