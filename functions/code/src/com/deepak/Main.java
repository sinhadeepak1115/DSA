package com.deepak;

import java.util.Scanner;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
         sum();
    }
//    Function
    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1:");
        int num1 = in.nextInt();
        System.out.println("Enter number 2:");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum :"+ sum);
    }
}
