package com.deepak;

public class Swap {
    public static void main(String[] args) {
        swap(9,8);
    }
    static void swap(int i, int j) {
        int temp =i;
        i=j;
        j=temp;
        System.out.println(i +" "+ j);
    }
}
