package com.nkei.n0_1000;

public class N14_LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        int strsLength = strs.length;
        if (strsLength < 1 || strs[0].isEmpty()) {
            return "";
        }
        String firstStr = strs[0];
        if (strsLength == 1) {
            return firstStr;
        }
        for (int charIdx = 0; charIdx < firstStr.length(); charIdx++) {
            char currChar = firstStr.charAt(charIdx);
            for (int wordIdx = 1; wordIdx < strsLength; wordIdx++) {
                String str = strs[wordIdx];
                if (str.length() == charIdx || str.charAt(charIdx) != currChar) {
                    return result.toString();
                }
            }
            result.append(currChar);
        }
        return result.toString();
    }
}
