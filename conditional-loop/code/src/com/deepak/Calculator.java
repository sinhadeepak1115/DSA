package com.deepak;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Take input from user till user does not press X or x

        while (true){
            char op = in.next().trim().charAt(0);
            if ( op == '+' || op == '-'|| op == '*' || op == '/' || op == '%'){
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                int result = 0;
                if (op == '+'){
                    result = num1 + num2;
                }else if (op == '-'){
                    result = num1 - num2;
                }else if (op == '*'){
                    result = num1 * num2;
                }else if (op == '/'){
                    result = num2 / num1;
                }
                System.out.println(result);

        }else if( op =='X'|| op == 'x'){
                break;
            }
    }
}
