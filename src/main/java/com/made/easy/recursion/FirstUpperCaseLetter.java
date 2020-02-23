package com.made.easy.recursion;

/**
 * Created by Ujjwal Gupta on Feb,2020
 */

/**
 * First uppercase letter in a string (Iterative and Recursive) Given a string find its first uppercase letter
 *
 * Examples :
 *
 * Input : geeksforgeeKs
 * Output : K
 *
 * Input  : geekS
 * Output : S
 */
public class FirstUpperCaseLetter {

    public static char firstUppercaseLetter(String text,int i){
        if(text.charAt(i) == '\0'){
            return 0;
        }
        if(Character.isUpperCase(text.charAt(i))){
            return text.charAt(i);
        }
        return firstUppercaseLetter(text, i + 1);
    }

    public static void main(String[] args) {
        System.out.println(Character.toString('\0'));
        String text = "geeksforgeeKs";
        System.out.println(firstUppercaseLetter(text,0));
    }
}
