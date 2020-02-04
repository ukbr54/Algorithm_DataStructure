package com.made.easy.interview.string;

public class Reverse {

    public static String reverse(String text){
        final char[] chars = text.toCharArray();

        for(int i=0; i<chars.length/2; i++){ // o(log n)
            char temp = chars[i];
            chars[i] = chars[chars.length-1-i];
            chars[chars.length-1-i] = temp;
        }

        return String.valueOf(chars);
    }

    public static String reverseUsingRecursion(String text){
        return null;
    }

    public static void main(String[] args) {
        System.out.println(reverse("word"));
        System.out.println(reverse("hello"));
    }
}
