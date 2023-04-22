package com.nkei.n0_1000.test;

import com.nkei.n0_1000.N9_PalindromeNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class N9_PalindromeNumberTest {

    @Test
    void isPalindrome_121() {
        N9_PalindromeNumber solution = new N9_PalindromeNumber();
        var result = solution.isPalindrome(121);
        assertTrue(result);
    }

    @Test
    void isNotPalindrome_1231() {
        N9_PalindromeNumber solution = new N9_PalindromeNumber();
        var result = solution.isPalindrome(1231);
        assertFalse(result);
    }

    @Test
    void isPalindrome_one_digit() {
        N9_PalindromeNumber solution = new N9_PalindromeNumber();
        var result = solution.isPalindrome(1);
        assertTrue(result);
    }

}