package com.deepak;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);
//        String word = "hello";
//        System.out.println(word.charAt(2));
        if (ch >= 'a' && 'z' >= ch){
            System.out.println("Lower case");
        }else{
            System.out.println("Upper case");
        }

    }
}
