package com.made.easy.interview.string;

/**
 * Created by Ujjwal Gupta on Jan,2020
 */

/**
 * An anagram of a string is another string that contains same characters, only the order of characters can be different.
 * For example, “abcd” and “dabc” are anagram of each other.
 */
public class Anagram {

    public boolean isAnagram(String text1,String text2){
        if(text1.length() != text2.length()){
            return false;
        }else{
            char[] chars = text1.toCharArray();
            for(int i=0; i<chars.length; i++){
                if(text2.indexOf(String.valueOf(chars[i])) == -1){
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Anagram a = new Anagram();
        System.out.println(a.isAnagram("SILENT", "LISTEN"));
        System.out.println(a.isAnagram("TRIANGLE","INTEGRAL"));
    }
}
