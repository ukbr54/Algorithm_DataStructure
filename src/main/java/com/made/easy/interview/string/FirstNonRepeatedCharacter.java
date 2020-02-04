package com.made.easy.interview.string;

/**
 * Created by Ujjwal Gupta on Jan,2020
 */

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * find the first non-repeated character
 * for example in the world "hello", except 'l' all are non-repeated, but 'h' is the first non-repeated character.
 */
public class FirstNonRepeatedCharacter {

    public static Character firstNonRepeatedCharacter(String text){
        Map<Character, Integer> map =
                text.chars()
                .mapToObj(x -> (char)x)
                .collect(Collectors.toMap(Function.identity(), x -> 1, (oldValue, newValue) -> oldValue + 1,LinkedHashMap::new));

        Optional<Map.Entry<Character, Integer>> entry = map.entrySet().stream().filter(m -> m.getValue() == 1).findFirst();
        return entry.get().getKey();
    }

    public static void main(String[] args) {
        System.out.println(firstNonRepeatedCharacter("hello"));
        System.out.println(firstNonRepeatedCharacter("mom"));
    }
}
