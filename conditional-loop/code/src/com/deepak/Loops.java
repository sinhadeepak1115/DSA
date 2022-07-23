package com.deepak;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

//        For Loops
        for (int num=1; num <=5; num +=1){
            System.out.println(num);
        }

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0;i <= n; i++){
            System.out.println(i);
        }

//        While Loops
        int num = 1;
        while (num <= n){
            System.out.println(num);
            num++;
        }

    }
}
