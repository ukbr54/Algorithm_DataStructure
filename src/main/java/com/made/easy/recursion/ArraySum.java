package com.made.easy.recursion;

/**
 * Created by Ujjwal Gupta on Feb,2020
 */
public class ArraySum {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        System.out.println(sumOfArray(arr, arr.length - 1));
    }

    public static int sumOfArray(int[] arr,int length){
        if(length == 0){
            return arr[0];
        }else{
            return arr[length] + sumOfArray(arr,length-1);
        }
    }
}
