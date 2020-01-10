package com.made.easy.interview;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ujjwal Gupta on Jan,2020
 */
public class FindDuplicateNumber {

    public static void main(String[] args) {
        int[] arr = {3,1,3,4,2};
        int duplicate = findDuplicate(arr);
        System.out.println("Duplicate Number is: "+duplicate);
    }

    public static int findDuplicate(int[] arr){
        int duplicate = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if(map.containsKey(arr[i])){
                Integer value = map.get(arr[i]);
                map.put(arr[i],value + 1);
            }else{
                map.put(arr[i],1);
            }
        }

        for(Map.Entry<Integer,Integer> result : map.entrySet()){
            if(result.getValue() > 1){
                duplicate = result.getKey();
            }
        }
        return duplicate;
    }
}
