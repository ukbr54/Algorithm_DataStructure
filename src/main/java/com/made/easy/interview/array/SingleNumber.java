package com.made.easy.interview.array;

/**
 * Created by Ujjwal Gupta on Feb,2020
 */

import java.util.HashMap;
import java.util.Map;

/**
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 *
 * Example
 * Input: [2,2,1]
 * Output: 1
 *
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 *
 * ^ | 0 1      ^ | F T
 * --+-----     --+-----
 * 0 | 0 1      F | F T
 * 1 | 1 0      T | T F
 */
public class SingleNumber {

    public static int singleNumber(int[] nums) {
        int result = 0;
        for(int i=0; i<nums.length; i++){
            result = result ^ nums[i];
        }
        return result;
    }

    // 2*(sum_of_array_without_duplicates) – (sum_of_array)

    /**
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * @param nums
     * @return
     */
    public static int mathematicalApproach(int[] nums){
        Map<Integer,Integer> map = new HashMap<>();
        int sum1=0,sum2=0;

        for(int i=0; i<nums.length; i++){
            if(!map.containsKey(nums[i])){
                sum1 = sum1 + nums[i];
                map.put(nums[i],1);
            }
            sum2 = sum2 + nums[i];
        }
        return ((2*sum1) - sum2);
    }

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{2, 3, 5, 4, 5, 3, 4}));

        System.out.println(mathematicalApproach(new int[]{2, 3, 5, 4, 5, 3, 4}));
    }
}
