package lession_03;

import java.util.Arrays;

public class lab_03 {

    public static void main(String[] args) {

        //lab 3.1
        int count_Even = 0;
        int count_Odd = 0;
        int[] myIntArray = new int[]{5, 1, 55, 6, 18, 13, 10, 17, 20, 33};
        System.out.println(Arrays.toString(myIntArray));
        for (int value : myIntArray) {
            //System.out.println(value);
            if (value % 2 == 0) {
                count_Even++;
            } else {
                count_Odd++;
            }
        }

        System.out.println("Even number count :" + count_Even);
        System.out.println("Odd number count :" + count_Odd);
        //System.out.println(myIntArray.length);

        //lab3.2
        int maxNumber = myIntArray[0];
        int minNumber = myIntArray[0];
        for (int i = 0; i < myIntArray.length; i++) {
            if (maxNumber < myIntArray[i]) {
                maxNumber = myIntArray[i];
            } else if (minNumber > myIntArray[i]) {

                minNumber = myIntArray[i];
            }
        }
        System.out.println("Max value: " + maxNumber);
        System.out.println("Min value: " + minNumber);

        //lab3.3
        int temp1;
        int temp2;
        boolean a = false;
        while (!a) {
            a = true;
            for (int j = 0; j < myIntArray.length - 1; j++) {
                if (myIntArray[j] > myIntArray[j + 1]) {
                    temp1 = myIntArray[j];
                    temp2= myIntArray[j+1];
                    myIntArray[j] = temp2;
                    myIntArray[j + 1] = temp1;
                    a=false;
                }
            }
        }
        System.out.println("Sort array min to max :" +Arrays.toString(myIntArray));
    }
}
