package com.deepak;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();
        switch (empID) {
            case 1 -> System.out.println("Deepak Kumar Sinaha");
            case 2 -> System.out.println("King");
            case 3 -> {
                System.out.println("Guest login as ");
                switch (department){
                    case "IT" -> System.out.println("IT");
                    case "Management" -> System.out.println("Management");
                    default -> System.out.println("No department");
                }
            }
        }
    }
}
