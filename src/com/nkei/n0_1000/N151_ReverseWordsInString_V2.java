package com.nkei.n0_1000;

import java.util.StringJoiner;

public class N151_ReverseWordsInString_V2 {
    public String reverseWords(String s) {
        String[] arr = s.trim().split("\\s+");
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = arr.length - 1; i >= 0; i--) {
            String str = arr[i];
            if (!str.isEmpty()) {
                joiner.add(str);
            }
        }

        return joiner.toString();
    }
}
