package com.deepak;

import java.util.Arrays;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Deepak";
        char target = 'p';
        System.out.println(search(name, target));
        System.out.println(Arrays.toString(name.toCharArray()));
    }
    static boolean search(String str, char target) {
        if (str.length() ==0){
            return false;
        }
        for ( int i = 0; i < str.length(); i++ ){
            if (target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
