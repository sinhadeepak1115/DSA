package com.deepak;

import java.util.Scanner;

public class NumberOfTimes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number you want:");
        int n = in.nextInt();
        System.out.println("Enter the number you want to count:");
        int m = in.nextInt();
        int times = 0;
        while(n != 0){
            int i = n % 10;
            if (i == m){
                times++;
            }
            n = n /10;
        }
        System.out.println(times);
    }
}
