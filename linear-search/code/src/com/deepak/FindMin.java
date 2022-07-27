package com.deepak;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {80 ,78, 56, 65, -90, 38};
        System.out.println(min(arr));
    }
    static int min(int[] arr) {
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if( arr[i] < ans ) ans = arr[i];
        }
        return ans;
    }
}
