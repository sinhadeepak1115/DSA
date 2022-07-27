package com.deepak;

import java.util.Arrays;

public class PassingInFunc {
    public static void main(String[] args) {
        int[] nums = {3,5,6,7,6,7};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void  change(int[] arr) {
        arr[0] = 100;
    }
}
