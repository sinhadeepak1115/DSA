package com.deepak;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the size of Array");
        int len = in.nextInt();
        System.out.println("The no you want to check");
        int n = in.nextInt();
        int sum = 0;
        int[] arr = new int[len];
        for ( int i=0; i < arr.length; i++ ) {
            arr[i] = in.nextInt();
            if ( arr[i] == n ) {
                sum ++;
            }
        }
        System.out.println(Arrays.toString(arr));
        if ( sum != 0){
            System.out.println("The no you were searching is there in list and is "+ sum +" no of times");
        }else{
            System.out.println("Sorry the no is not in the list.");
        }

    }

}
