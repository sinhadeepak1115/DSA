package com.deepak;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//	input using loops in Arrays
        Scanner in = new Scanner(System.in);
        String[] str = new String[4];
        for (int i=0 ; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
    }

}
