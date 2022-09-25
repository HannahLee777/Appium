package lession_06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class lab_06 {
    private static List<Integer> myList;
    private static List<String> myStringList, myUrlString;
    private static int count;
    public static void main(String[] args) {
        calculateTime();
        inputPassword();
        extractDigit();
        checkUrl();
    }

    public static void calculateTime(){
        myList = new ArrayList<>();
        String MY_STR = "2hrs and 5 minutes";

        char[] strChar = MY_STR.toCharArray();
        for (char character : strChar){
            if(Character.isDigit(character)) {
                System.out.println(character + " is digit");
                myList.add((Integer.parseInt(String.valueOf(character))));
            }
        }
        int totalMinute = myList.get(0)*60 + myList.get(1);
        System.out.println("Total in minutes: " + totalMinute);
    }

    public static void inputPassword(){
        final String MY_PASSWORD = "password123";

        boolean a = true;
        while(a){
            System.out.println("Please enter password: ");
            Scanner scanner = new Scanner(System.in);
            String inputPass = scanner.nextLine();
            if (inputPass.equals(MY_PASSWORD)) {
                System.out.println("Correct password");
                a = false;
            }else{
                count += 1;
                System.out.println("wrong password");
                a = true;
            }
            if (count ==3){
                a = false;
                System.out.println("account is locked");
            }
        }
    }

    public static void extractDigit(){
        myStringList = new ArrayList<>();
        final String MY_STRING = "100 minutes456 abc 456 888";
        StringBuilder myNewStr = new StringBuilder();
        char[] strChar = MY_STRING.toCharArray();

        for (char character : strChar){
            if(Character.isDigit(character)) {
                myStringList.add(String.valueOf(character));
            }
        }
//        System.out.println(myStringList);

        for(int i=0; i <myStringList.size();i++) {
            myNewStr.append(myStringList.get(i));
        }

        System.out.println(myNewStr);
    }

    public static void checkUrl(){
        myUrlString = new ArrayList<>();
        StringBuilder myTempDomain = new StringBuilder();

        final String URL = "https:google.com";
        final String HTTP_PROTOCOL = "http";
        final String HTTPS_PROTOCOL = "https";
        final String COM_DOMAIN = ".com";
        final String NET_DOMAIN= ".net";

        String[] strArray1 = URL.split(":");
        String myProtocal = strArray1[0];

//        System.out.println(myProtocal);

        char[] strChar = URL.toCharArray();
        for (char character : strChar){
            myUrlString.add(String.valueOf(character));
        }

        for(int i = 4; i >0; i--){
            myTempDomain.append(myUrlString.get(myUrlString.size()-i));
        }

        String myDomain = myTempDomain.toString();

//        System.out.println(myDomain);

//        System.out.println(myUrlString);
//        System.out.println(Arrays.toString(strArray1));

        //compare protocol
        if(myProtocal.equals(HTTP_PROTOCOL)){
            System.out.println("This is: " + HTTP_PROTOCOL);
        } else if (myProtocal.equals(HTTPS_PROTOCOL)) {
            System.out.println("This is: " + HTTPS_PROTOCOL);
        }
        else {
            System.out.println("Other protocol");
        }

        //compare domain name
        if(myDomain.equals(COM_DOMAIN)){
            System.out.println("This is: " +COM_DOMAIN);
        } else if (myDomain.equals(NET_DOMAIN)) {
            System.out.println("This is: " +NET_DOMAIN);
        }else {
            System.out.println("Other domain");
        }


    }
}

