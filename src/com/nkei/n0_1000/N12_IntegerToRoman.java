package com.nkei.n0_1000;

import java.util.Map;

public class N12_IntegerToRoman {
    private static final Map<Integer, Character> ROMAN_ALPHABET =
            Map.of( 1, 'I', 5, 'V', 10, 'X', 50, 'L', 100, 'C', 500, 'D', 1000, 'M');

    public String intToRoman(int num) {
        StringBuilder roman = new StringBuilder();
        for (int i = String.valueOf(num).length() - 1; i >= 0; i--) {
            int multiplier = (int) Math.pow(10, i);
            int digit = num / multiplier % 10;
            if (digit == 9) {
                roman.append(ROMAN_ALPHABET.get(multiplier));
                roman.append(ROMAN_ALPHABET.get(multiplier * 10));
            } else if (digit >= 5) {
                roman.append(ROMAN_ALPHABET.get(multiplier * 5));
                for (int j = 0; j < digit - 5; j++) {
                    roman.append(ROMAN_ALPHABET.get(multiplier));
                }
            } else if (digit == 4) {
                roman.append(ROMAN_ALPHABET.get(multiplier));
                roman.append(ROMAN_ALPHABET.get(multiplier * 5));

            } else {
                for (int j = 0; j < digit; j++) {
                    roman.append(ROMAN_ALPHABET.get(multiplier));
                }
            }
        }

        return roman.toString();
    }
}
