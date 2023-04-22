package com.nkei.n1001_2000;

/**
 * You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer
 * than the other, append the additional letters onto the end of the merged string.
 *
 * Return the merged string.
 *
 * 1 <= word1.length, word2.length <= 100
 * word1 and word2 consist of lowercase English letters.
 */
public class N1768_MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int i, word2Size = word2.length();
        for (i = 0; i < word1.length(); i++) {
            if (i == word2Size) {
                return result.append(word1.substring(i)).toString();
            }
            result.append(word1.charAt(i)).append(word2.charAt(i));
        }
        return result.append(word2.substring(i)).toString();
    }
}
