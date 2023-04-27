package com.nkei.n1001_2000.test;

import com.nkei.n1001_2000.N1071_GreatestCommonDivisorOfStrings;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class N1071_GreatestCommonDivisorOfStringsTest {

    @Test
    void gcdOfStrings() {
        N1071_GreatestCommonDivisorOfStrings solution = new N1071_GreatestCommonDivisorOfStrings();
        String result = solution.gcdOfStrings("ABCABC", "ABC");
        assertEquals("ABC", result);
    }

    @Test
    void gcdOfStrings2() {
        N1071_GreatestCommonDivisorOfStrings solution = new N1071_GreatestCommonDivisorOfStrings();
        String result = solution.gcdOfStrings("ABABAB", "ABAB");
        assertEquals("AB", result);
    }

    @Test
    void gcdOfStrings3() {
        N1071_GreatestCommonDivisorOfStrings solution = new N1071_GreatestCommonDivisorOfStrings();
        String result = solution.gcdOfStrings("LEET", "CODE");
        assertEquals("", result);
    }

    @Test
    void gcdOfStrings4() {
        N1071_GreatestCommonDivisorOfStrings solution = new N1071_GreatestCommonDivisorOfStrings();
        String result = solution.gcdOfStrings("AB", "ABAB");
        assertEquals("AB", result);
    }

    @Test
    void gcdOfStrings5() {
        N1071_GreatestCommonDivisorOfStrings solution = new N1071_GreatestCommonDivisorOfStrings();
        String result = solution.gcdOfStrings("AB", "AHAB");
        assertEquals("", result);
    }

    @Test
    void gcdOfStrings6() {
        N1071_GreatestCommonDivisorOfStrings solution = new N1071_GreatestCommonDivisorOfStrings();
        String result = solution.gcdOfStrings("", "");
        assertEquals("", result);
    }

    @Test
    void gcdOfStrings7() {
        N1071_GreatestCommonDivisorOfStrings solution = new N1071_GreatestCommonDivisorOfStrings();
        String result = solution.gcdOfStrings("ABC", "ABCABCABC");
        assertEquals("ABC", result);
    }

    @Test
    void gcdOfStrings8() {
        N1071_GreatestCommonDivisorOfStrings solution = new N1071_GreatestCommonDivisorOfStrings();
        String result = solution.gcdOfStrings("ABCDEF", "ABC");
        assertEquals("", result);
    }

    @Test
    void gcdOfStrings9() {
        N1071_GreatestCommonDivisorOfStrings solution = new N1071_GreatestCommonDivisorOfStrings();
        String result = solution.gcdOfStrings("AAAAAAAAA", "AAACCC");
        assertEquals("", result);
    }
}