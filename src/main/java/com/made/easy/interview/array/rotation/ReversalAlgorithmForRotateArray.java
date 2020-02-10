package com.made.easy.interview.array.rotation;

/**
 * Created by Ujjwal Gupta on Feb,2020
 */

import java.util.Arrays;

/**
 * Let AB are the two parts of the input array where A = arr[0..d-1] and B = arr[d..n-1]. The idea of the algorithm is :
 *  1. Reverse A to get ArB, where Ar is reverse of A.
 *  2. Reverse B to get ArBr, where Br is reverse of B.
 *  3. Reverse all to get (ArBr) r = BA.
 *
 *  Time Complexity : O(n)
 */
public class ReversalAlgorithmForRotateArray {

    static void leftRotate(int[] arr,int d){
        if (d == 0)
            return;
        int n = arr.length;
        reverseArray(arr, 0, d - 1);
        reverseArray(arr, d, n - 1);
        reverseArray(arr, 0, n - 1);

        System.out.println(Arrays.toString(arr));
    }

    static void reverseArray(int[] arr,int start,int end){
        int temp;
        while(start < end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        leftRotate(arr,2);
    }
}
