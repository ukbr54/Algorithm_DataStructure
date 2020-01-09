package com.made.easy.interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Count pairs with given sum
 * Given an array of integers, and a number ‘sum’, find the number of pairs of integers in the array whose sum is equal to ‘sum’.
 *
 * Random Integer array : [0, 14, 0, 4, 7, 8, 3, 5, 7]
 * Sum : 11
 * pair of numbers from an array whose sum equals 11
 * (7, 4)
 * (3, 8)
 * (7, 4)
 *
 */
public class CountPairGivenSum {

    public static void main(String[] args) {
        int[] arr = {0, 14, 0, 4, 7, 8, 3, 5, 7};

        int givenSum = 11;
        //o/p -> {2,4}, {3,3}

        findPairsWithForLoop(arr,givenSum);
    }

    public static List<Integer> findPairsWithForLoop(int[] input, int sum) {
        final List<Integer> allDifferentPairs = new ArrayList<Integer>();
        final Map<Integer, Integer> pairs = new HashMap<Integer, Integer>();
        for (int i : input) {
            // if the key is available in the map add into the list ex - pairs.get(7) => 4 and it is not null
            if (pairs.containsKey(i)) {
                if (pairs.get(i) != null) {
                    allDifferentPairs.add(i);
                }

                // Mark pair as added to prevent duplicates
                pairs.put(sum - i, null);
            }
            // if the value is not available in the map put it ex - pairs.put([11-4],4) => 7,4
            else if (!pairs.containsValue(i)) {
                pairs.put(sum - i, i);
            }
        }

        System.out.println(allDifferentPairs);
        return allDifferentPairs;
    }

}
