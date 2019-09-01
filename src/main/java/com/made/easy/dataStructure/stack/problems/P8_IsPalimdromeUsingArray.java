package com.made.easy.dataStructure.stack.problems;

/**
 *  Given an array of characters formed with a's and b's. The string is marked with special Character X which represents the middle
 *  of the list. Check whether the  string is palindrome.
 *
 *
 *  ababXbaba
 */
public class P8_IsPalimdromeUsingArray {

    public static void isPalindrome(String input){
        int i = 0, j = input.length() - 1;
        while(i<j && input.charAt(i) == input.charAt(j)){
            i++;
            j--;
        }

        if(i<j){
            System.out.println("Not a Palindrome");
        }else{
            System.out.println("Palindrome");
        }
    }

    public static void main(String[] args) {
        isPalindrome("ababXbaba");
    }
}
