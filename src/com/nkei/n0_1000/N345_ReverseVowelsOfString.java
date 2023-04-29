package com.nkei.n0_1000;

import java.util.Set;

/**
 * Given a string s, reverse only all the vowels in the string and return it.
 *
 * The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
 */
public class N345_ReverseVowelsOfString {
    private static final Set<Character> VOWELS = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

    public String reverseVowels(String s) {
        int length = s.length();
        int l = 0;
        int r = length - 1;
        char[] result = new char[length];

        while (l <= r) {
            char lChar = s.charAt(l);
            char rChar = s.charAt(r);
            if (!VOWELS.contains(lChar)) {
                result[l++] = lChar;
            } else if (!VOWELS.contains(s.charAt(r))) {
                result[r--] = rChar;
            } else {
                result[l++] = rChar;
                result[r--] = lChar;
            }
        }

        return new String(result);
    }
}
