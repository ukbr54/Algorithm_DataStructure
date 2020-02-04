package com.made.easy.interview.array;

import java.util.Arrays;

/**
 * Created by Ujjwal Gupta on Feb,2020
 */
public class RotateArray {

    public static void rotate(int[] nums,int k){
        int n = nums.length;

        for(int i=0; i<n && k>0; i++){
            int temp = nums[i];
            nums[i] = nums[n-k];
            nums[n-k] = temp;
            k--;
        }

        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        rotate(array,3);
    }
}
