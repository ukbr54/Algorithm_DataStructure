package com.made.easy.interview.array.rotation;

import java.util.Arrays;

/**
 * Created by Ujjwal Gupta on Feb,2020
 */

/**
 *   --------------- Rotate one by one --------------------
 *   Given Array: {1,2,3,4,5,6,7} and rotation = 2.
 *   Output: {3,4,5,6,7,1,2}
 *
 *   Time Complexity: O(n * d)
 *   Space Complexity: O(1)
 *
 *   ----------------------- By Juggling Algorithm ------------------------
 *
 * Instead of moving one by one, divide the array in different sets
 * where number of sets is equal to GCD of n and d and move the elements within sets.
 *
 * Time complexity : O(n)
 * Auxiliary Space : O(1)
 *
 */
public class RotateArray {

    static int gcd(int a, int b){
        if(b == 0) return a;
        else return gcd(b,a%b);
    }

    public static void arrayRotateUsingJuggling(int[] arr,int d){
        int j,k,temp;
        int g_c_d = gcd(d,arr.length);
        for(int i=0; i<g_c_d; i++){
            temp = arr[i];
            j = i;
            while(true){
                k = j + d;
                if(k >= arr.length) k = k - arr.length;
                if(k == i) break;
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void rotate(int[] nums,int k){
        for(int i=0; i<k; i++){
            leftRotateByOne(nums,nums.length);
        }
        System.out.println(Arrays.toString(nums));
    }

    static void leftRotateByOne(int[] arr,int n){
        int temp = arr[0];
        for(int i=0; i<n-1; i++){
            arr[i] = arr[i+1];
        }
        arr[n-1] = temp;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        rotate(array,2);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        arrayRotateUsingJuggling(arr,3);
    }
}
