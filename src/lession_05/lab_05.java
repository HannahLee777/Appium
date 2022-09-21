package lession_05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class lab_05 {
    //List<Integer> myList = new ArrayList<>();
    public static void main(String[] args) {

        boolean isContinuing = true;
        while (isContinuing){
            printMenu();
            int userOption = getUserOption();
            if (userOption==0){
                isContinuing=false;
            } else if (userOption==1) {
                inputNumber();
            } else if (userOption==2) {
                printNumber();
            } else if (userOption==3) {
                getMinMaxNumber();
                System.out.println("max number: "+maxNumber);
            }
            else if (userOption==4){
                getMinMaxNumber();
                System.out.println("min number: "+minNumber);
            }
        }


    }

    public static void printMenu () {
        System.out.println(" Menu: \n" +
                    "1. Input number to array list\n" +
                    "2. Print number\n" +
                    "3. Get maximum number\n" +
                    "4. Get minimum number\n" +
                    "5. Search for a number in the number list\n" +
                    "0. Exit");

        }

    public static int getUserOption() {
        System.out.println("Please enter number to select menu:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();

    }

    private static List<Integer> myList;
    public static void inputNumber(){

            //List<Integer> myList = new ArrayList<>();
            //int index = myList.indexOf();
            myList = new ArrayList<>();
            System.out.println("Please enter an integer to add number to arraylist, 'done' to stop adding");
            Scanner scanner2 = new Scanner(System.in);

            boolean a= true;
            while (a) {
                String numInput = scanner2.nextLine();
                //int num = numInput.parse
                if (numInput.equals("done")){
                    a=false;
                }
                else {
                    myList.add(Integer.parseInt(numInput));
                    //myList.add(numInput);
                    System.out.println(myList);
                }

            }
    }


    public static void printNumber(){
        //myList=new ArrayList<>();
        System.out.println(myList);
    }

    private static int maxNumber,minNumber;
    public static void getMinMaxNumber() {
            System.out.println(myList);
            //int a = Integer.parseInt(myList.indexOf(0));
            maxNumber = myList.get(0);
            //System.out.println(maxNumber);
            minNumber = myList.get(0);
            for (int i = 0; i < myList.size(); i++) {
                if (maxNumber < myList.get(i)) {
                    maxNumber = myList.get(i);
                } else if (minNumber > myList.get(i)) {
                    minNumber = myList.get(i);
                }
            }
            //System.out.println("Max value: " + maxNumber);
            //System.out.println("Min value: " + minNumber);
    }

}




