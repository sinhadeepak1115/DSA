package com.deepak;

import java.util.Arrays;

public class ColNoFixed {
    public static void main(String[] args) {
        int[][] arr = {
                {1,3,4,5},
                {5,6},
                {2,3,5,5,6,6}
        };
        for( int i = 0; i < arr.length; i++ ) {
            for( int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j]+ " ");
            }
        System.out.println();
        }
    }
}
