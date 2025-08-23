package com.dev.lib.stringprogram;

import java.util.HashMap;
import java.util.Map;

public class CheckCharacterCount {
    public static void main(String[] args) {
    String output= getCharacterCount();
    System.out.print(output);
    }


    public static String getCharacterCount() {
        String str1 = "abcdABCDabcd";

        char[] chars = str1.toCharArray();
        Map<Character, Integer> charsCount = new HashMap<>();
        for (char c: chars) {
            if (charsCount.containsKey(c)) {
                charsCount.put(c, charsCount.get(c) + 1);
            } else
                charsCount.put(c, 1);
        }
        return charsCount.toString();
    }
}


