package com.made.easy.interview.array;

/**
 * Created by Ujjwal Gupta on Feb,2020
 */


/**
 * Given nums = [1,1,2],
 *
 * Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
 *
 * It doesn't matter what you leave beyond the returned length.
 *
 *
 * -> One index i, to iterate over the array, and
 * -> Another index j, to keep track of the number of unique elements found so far. This index will move only when we modify the array
 *    in-place to include a new non-duplicate element.
 */
public class RemoveDuplicatesSortedArray {

    public static int removeDuplicates(int[] nums){
        int n = nums.length;
        int j = 0;

        for(int i=0; i<n; i++){
            if(i < n-1 && nums[i] == nums[i+1]) continue;

            nums[j++] = nums[i];
        }
        return j;
    }

    public static void main(String[] args) {
        int[] array = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(array));
    }
}
