package com.made.easy.interview.array.rotation;

import java.util.Arrays;

/**
 * Created by Ujjwal Gupta on Feb,2020
 */
public class LeftRightRotateByOne {

    static void leftRotateByOne(int[] arr){
        int temp = arr[0];
        for(int i=0; i<arr.length-1; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = temp;
        System.out.println(Arrays.toString(arr));
    }

    static void rightRotateByOne(int[] arr){
        int n = arr.length;
        int temp = arr[n-1];
        for(int i=n-1; i>0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        leftRotateByOne(arr);
        int[] arr1 = {1,2,3,4,5,6,7};
        rightRotateByOne(arr1);
    }
}
