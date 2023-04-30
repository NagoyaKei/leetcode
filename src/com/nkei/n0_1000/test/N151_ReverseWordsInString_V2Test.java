package com.nkei.n0_1000.test;

import com.nkei.n0_1000.N151_ReverseWordsInString_V2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class N151_ReverseWordsInString_V2Test {

    @Test
    void reverseWords() {
        N151_ReverseWordsInString_V2 solution = new N151_ReverseWordsInString_V2();
        String result = solution.reverseWords("the sky is blue");
        assertEquals("blue is sky the", result);
    }

    @Test
    void reverseWords2() {
        N151_ReverseWordsInString_V2 solution = new N151_ReverseWordsInString_V2();
        String result = solution.reverseWords("  hello world  ");
        assertEquals("world hello", result);
    }

    @Test
    void reverseWords3() {
        N151_ReverseWordsInString_V2 solution = new N151_ReverseWordsInString_V2();
        String result = solution.reverseWords("a good   example");
        assertEquals("example good a", result);
    }
}