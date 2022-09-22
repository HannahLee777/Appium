package lession_05;

import com.sun.xml.internal.ws.addressing.WsaTubeHelperImpl;

import java.util.*;

public class lab_05 {
    //List<Integer> myList = new ArrayList<>();
    public static void main(String[] args) {

        boolean isContinuing = true;

        while (isContinuing){
            printMenu();
            int userOption = getUserOption();
            if (userOption==0){
                isContinuing=false;
            } else {
                switch (userOption) {
                    case 1:
                        inputNumber();
                        break;
                    case 2:
                        printNumber();
                        break;
                    case 3:
                        getMinMaxNumber();
                        System.out.println("max number: " + maxNumber);
                        break;
                    case 4:
                        getMinMaxNumber();
                        System.out.println("min number: " + minNumber);
                        break;
                    case 5:
                        searchForNumber();
                        break;
                    default:
                        System.out.println("Please enter menu option again");
                }
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
        myList = new ArrayList<>();
        System.out.println("Please enter an integer to add number to arraylist, 'done' to stop adding");
        Scanner scanner2 = new Scanner(System.in);

        boolean a= true;
        while (a) {
            String numInput = scanner2.nextLine();
            if (numInput.equals("done")){
                a=false;
            }
            else {
                myList.add(Integer.parseInt(numInput));
                System.out.println(myList);
            }

        }
    }


    public static void printNumber(){
        System.out.println(myList);
    }

    private static int maxNumber,minNumber;
    public static void getMinMaxNumber() {
        System.out.println(myList);
        maxNumber = myList.get(0);
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

    public  static void searchForNumber(){
        System.out.println("Please enter a number to search in the ArrayList: ");
        Scanner scanner3 = new Scanner(System.in);
        int searchNumber = scanner3.nextInt();
        int index = myList.indexOf(searchNumber);

        if (myList.isEmpty()) {
            System.out.println("ArrayList is Empty");
        } else if (index<0) {
            System.out.println(searchNumber + " is not found");
        }

        for (int i = 0; i < myList.size(); i++){
            if (searchNumber==myList.get(i) ){
                System.out.println(searchNumber + " is found with index: " + i);
            }
        }
    }
}




