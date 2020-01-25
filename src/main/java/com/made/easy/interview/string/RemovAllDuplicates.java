package com.made.easy.interview.string;

/**
 * Created by Ujjwal Gupta on Jan,2020
 */
public class RemovAllDuplicates {

    public String removeAllDuplicate(String text){
        StringBuilder sb = new StringBuilder(text.length());

        for(int i=0; i<text.length(); i++){
            char c = text.charAt(i);
            if(sb.indexOf(String.valueOf(c)) == -1){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
