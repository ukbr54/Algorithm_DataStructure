package com.made.easy.interview.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by Ujjwal Gupta on Feb,2020
 */
public class ContainDuplicateCheck {

    public static boolean containsDuplicate(int[] nums) {

        //toMap(Function keyMapper, Function valueMapper, BinaryOperator mergeFunction)
        BinaryOperator<Integer> op = (oldValue,newValue) -> oldValue + 1;
        Map<Integer, Integer> map = Arrays.stream(nums).mapToObj(x -> x).collect(Collectors.toMap(Function.identity(),x->1,op));
        System.out.println(map);
        boolean match = map.entrySet().stream().anyMatch(x -> x.getValue() > 1);
        return match;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,7,7,7};
        System.out.println(containsDuplicate(arr));
    }
}