package com.deepak;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 24, 56},
                {45, 56, 23 , 45, 45},
                {45, 56, 29, 95},
                {89, 67, 23}
        };
        int target = 45;
        System.out.println(search(arr, target));
    }
    static int search(int[][] arr, int target) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
            if ( arr[i][j] == target ) {
                ans++;
            }
            }
        }
        return ans;
    }
}
