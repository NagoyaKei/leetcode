package com.nkei.n1001_2000;

/**
 * For two strings s and t, we say "t divides s" if and only if s = t + ... + t (i.e., t is concatenated with itself one or more times).
 *
 * Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.
 */
public class N1071_GreatestCommonDivisorOfStrings {

    public String gcdOfStrings(String str1, String str2) {
        int str1Len = str1.length();
        int str2Len = str2.length();
        if (str1Len == 0 || str2Len == 0) {
            return "";
        }

        int gcd = str1Len > str2Len ? gcd(str1Len, str2Len) : gcd(str2Len, str1Len);
        String prefix = str1.substring(0, gcd);

        str1 = removeByPrefix(str1, prefix);
        str2 = removeByPrefix(str2, prefix);

        return str1.isEmpty() && str2.isEmpty() ? prefix : "";
    }

    private String removeByPrefix(String str, String prefix) {
        String temp = str;
        while (!temp.isEmpty()) {
            if (!temp.startsWith(prefix)) {
                return temp;
            }
            temp = temp.substring(prefix.length());
        }
        return "";
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
