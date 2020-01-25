package com.made.easy.interview.string;

/**
 * Created by Ujjwal Gupta on Jan,2020
 */

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

/**
 * find the first non-repeated character
 * for example in the world "hello", except 'l' all are non-repeated, but 'h' is the first non-repeated character.
 */
public class FirstNonRepeatedCharacter {

    public static Character firstNonRepeatedCharacter(String text){
        Map<Character,Integer> map = new LinkedHashMap<>(text.length());

        char[] chars = text.toCharArray();

        for(int i=0; i<chars.length; i++){
            if(map.containsKey(chars[i])){
                Integer value = map.get(chars[i]);
                map.put(chars[i],++value);
            }else{
                map.put(chars[i],1);
            }
        }

        Optional<Map.Entry<Character, Integer>> entry = map.entrySet().stream().filter(e -> e.getValue() == 1).findFirst();
        return entry.get().getKey();
    }

    public static void main(String[] args) {
        System.out.println(firstNonRepeatedCharacter("hello"));
        System.out.println(firstNonRepeatedCharacter("mom"));
    }
}
