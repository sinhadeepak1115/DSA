package com.deepak;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = input.nextInt();
//        System.out.println(num);
//        type casting
        int num1 = (int)(67.56f);
        System.out.println(num1);

//        int a = 257;
//        byte b = (byte) (a);// 257%256=1
//        System.out.println(b);

        byte a = 90;
        byte b = 78;
        byte c = 30;
        int d = (a*b)/c;
        System.out.println(d);
    }
}
