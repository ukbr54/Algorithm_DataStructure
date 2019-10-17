package com.made.easy.algorithm;

/**
 * Created by Ujjwal Gupta on Oct,2019
 */
public class SimpleTextSearch {

    public static int simpleTextSearch(char[] pattern, char[] text){
        int patterSize = pattern.length;
        int textSize = text.length;

        int i = 0;

        while((i + patterSize) <= textSize){
            int j = 0;
            while(text[i + j] == pattern[j]){
                j += 1;
                if(j >= patterSize) return i;
            }
            i += 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int search = simpleTextSearch("Big Ben".toCharArray(), "Private Walking tour London, Buckingham Palace to Big Ben and much more".toCharArray());
        System.out.println(search);
    }
}
