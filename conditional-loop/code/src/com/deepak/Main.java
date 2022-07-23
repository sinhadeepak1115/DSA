package com.deepak;

public class Main {

    public static void main(String[] args) {
//	    int salary = 25400;
//        if (salary > 10000){
//            salary = salary + 2000;
//        }else{
//            salary = salary +10000;
//        }

        int salary = 19000;
        if (salary > 10000){
            salary += 2000;
        }else if(salary > 20000) {
            salary += 10000;
        }else {
            salary += 2000;
        }
        System.out.println(salary);
    }
}
