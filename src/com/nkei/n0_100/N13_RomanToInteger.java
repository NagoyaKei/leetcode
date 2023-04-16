package com.nkei.n0_100;

import java.util.Map;

public class N13_RomanToInteger {
    public static final Map<Character, Integer> ROMAN_ALPHABET =
            Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000);

    public int romanToInt(String s) {
        int sum = 0;
        int curVal = ROMAN_ALPHABET.get(s.charAt(0));
        int nextVal = curVal;
        for (int i = 0; i < s.length() - 1; i++) {
            nextVal = ROMAN_ALPHABET.get(s.charAt(i + 1));
            sum += (curVal >= nextVal) ? curVal : -curVal;
            curVal = nextVal;
        }
        return sum + nextVal; // add last digit
    }
}
