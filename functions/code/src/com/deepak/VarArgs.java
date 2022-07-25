package com.deepak;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(3,4,5,6,765,5667,4,5,4556,45,67,6);
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
