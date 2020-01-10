package com.made.easy.interview;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;

/**
 * Created by Ujjwal Gupta on Jan,2020
 */
public class FindMissingNumber {

    public static void main(String[] args) {
        int arr[] ={9,6,4,2,3,5,7,0,1};

        long start = System.currentTimeMillis();
        int sum = getSumOfArray(arr);

        int sumOfNaturalNumber = (arr.length * (arr.length + 1)) / 2;

        int missingNumber = sumOfNaturalNumber - sum;
        System.out.println("Missing Number is: "+missingNumber);
        System.out.println("Execution time: "+(System.currentTimeMillis() - start));
    }

    public static int getSumOfArray(int[] arr){
       return  Arrays.stream(arr).reduce(0 ,(a,b) -> a + b);
    }
}
