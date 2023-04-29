package com.nkei.main.algorithms;

public class ReverseString {
    public String reverseString(String str) {
        int len = str.length();
        int l = 0;
        int r = len - 1;
        char[] result = new char[len];

        while (l <= r) {
            char swap = str.charAt(l);
            result[l] = str.charAt(r);
            result[r] = swap;
            l++;
            r--;
        }

        return new String(result);
    }
}
