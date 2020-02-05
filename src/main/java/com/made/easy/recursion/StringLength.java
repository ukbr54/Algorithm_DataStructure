package com.made.easy.recursion;

/**
 * Created by Ujjwal Gupta on Feb,2020
 */

/**
 * Program for length of a string using recursion
 * Given a string calculate length of the string using recursion.
 *
 * Examples:
 *
 * Input : str = "abcd"
 * Output :4
 *
 * Input : str = "GEEKSFORGEEKS"
 * Output :13
 */
public class StringLength {

    public static int recLength(String text){
        if(text.equals(""))
            return 0;
        else{
           return recLength( text.substring(1)) + 1;
        }
    }
    public static void main(String[] args) {
        String text = "HelloWorld";
        System.out.println(recLength(text));
    }
}
