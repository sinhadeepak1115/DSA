package com.deepak;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int [3][3];
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] =in.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
