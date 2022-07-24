package com.deepak;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number you want to reverse:");
        int n = in.nextInt();
        int j = 0;
        while (n > 0) {
            int i = n % 10;
            j = j*10 + i;
            n = n / 10;
        }
        System.out.println(j);
    }
}
