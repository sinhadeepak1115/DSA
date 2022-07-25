package com.deepak;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        String fruit = in.next();
        switch (fruit){
            case "Mango":
                System.out.println("King of Fruits");
                break;
            case "Apple":
                System.out.println("Keeps you away from Doctor");
                break;
            case "Grape":
                System.out.println("Small Fruit");
                break;
            case "Orange":
                System.out.println("Round Fruit");
                break;
            default:
                System.out.println("Please enter a valid Fruit.");
        }
        int day = in.nextInt();
        switch (day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thrusday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Please Enter a valid Input");
        }
    }
}
