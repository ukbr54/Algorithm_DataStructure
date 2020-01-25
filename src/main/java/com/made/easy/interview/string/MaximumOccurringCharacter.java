package com.made.easy.interview.string;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ujjwal Gupta on Jan,2020
 */
public class MaximumOccurringCharacter {

    public char findMaximumOccurringCharacter(String text){
        Map<Character,Integer> map = new HashMap<>();
        int max = 0;
        char maxChar = 0;
        char[] arr = text.toCharArray();
        for(int i=0; i<arr.length; i++){ // -> O(n)
           if(map.containsKey(arr[i])){
               Integer count = map.get(arr[i]);
               map.put(arr[i],++count);
           }else{
               map.put(arr[i],1);
           }
        }

        /**
         * TRADITIONAL FOR LOOP
         * for(Map.Entry<Character,Integer> entry : map.entrySet()){
         *    if(entry.getValue() > max){
         *         max = entry.getValue();
         *         maxChar = entry.getKey();
         *    }
         * }
         */

        Character key = Collections.max(map.entrySet(), Comparator.comparingInt(Map.Entry :: getValue)).getKey();

        Character key1 = Collections.max(map.entrySet(), (entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).getKey();

        Character key2 = Collections.max(map.entrySet(), (entry1, entry2) -> entry1.getValue() - entry2.getValue()).getKey();

        return key;
    }
}
