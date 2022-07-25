package com.deepak;

import java.util.Scanner;

public class ArmStrongNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(reverse(n));
        System.out.println(armStrong(n));
    }
    static int reverse(int n){
        int rev = 0;
        while(n > 0){
            int rem = n % 10;
            rev = rem + rev * 10;
            n = n /10;

        }
        return rev;
    }
    static boolean armStrong(int n){
        int sum = 0;
        int nu = n;
        while ( nu > 0){
            int rem = nu % 10;
            sum = sum + (rem * rem * rem);
            nu = nu/10;
        }

        if ( sum == n ){
            return true;
        }else {
            return false;
//            120
        }

    }
}
