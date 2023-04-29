package com.nkei.n0_1000.test;

import com.nkei.n0_1000.N345_ReverseVowelsOfString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class N345_ReverseVowelsOfStringTest {

    @Test
    void reverseVowels() {
        N345_ReverseVowelsOfString solution = new N345_ReverseVowelsOfString();
        String result = solution.reverseVowels("hello");
        assertEquals("holle", result);
    }

    @Test
    void reverseVowels2() {
        N345_ReverseVowelsOfString solution = new N345_ReverseVowelsOfString();
        String result = solution.reverseVowels("leetcode");
        assertEquals("leotcede", result);
    }

    @Test
    void reverseVowels3() {
        N345_ReverseVowelsOfString solution = new N345_ReverseVowelsOfString();
        String result = solution.reverseVowels("aA");
        assertEquals("Aa", result);
    }

    @Test
    void reverseVowels4() {
        N345_ReverseVowelsOfString solution = new N345_ReverseVowelsOfString();
        String result = solution.reverseVowels("A man, a plan, a canal: Panama");
        assertEquals("a man, a plan, a canal: PanamA", result);
    }
}