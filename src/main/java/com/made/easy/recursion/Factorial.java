package com.made.easy.recursion;

/**
 * Created by Ujjwal Gupta on Feb,2020
 */
public class Factorial {

    public static void main(String[] args) {
        int num = 4;
        System.out.println(factorial(num));
    }

    public static int factorial(int n){
        if(n == 0){
            return 1;
        }else{
            return factorial(n-1) * n;
        }
    }
}
