package com.deepak;

public class Shadowing {
    static int x = 90;
    public static void main(String[] args) {
        System.out.println(x);
        x =9900;
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
