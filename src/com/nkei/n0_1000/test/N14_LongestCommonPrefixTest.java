package com.nkei.n0_1000.test;

import com.nkei.main.test.helpers.TimingExtension;
import com.nkei.n0_1000.N14_LongestCommonPrefix;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(TimingExtension.class)
class N14_LongestCommonPrefixTest {

    @Test
    void longestCommonPrefix1() {
        N14_LongestCommonPrefix solution = new N14_LongestCommonPrefix();
        String result = solution.longestCommonPrefix(new String[] {"flower", "flow", "flight"});
        assertEquals("fl", result);
    }

    @Test
    void longestCommonPrefix2() {
        N14_LongestCommonPrefix solution = new N14_LongestCommonPrefix();
        String result = solution.longestCommonPrefix(new String[] {"dog","racecar","car"});
        assertEquals("", result);
    }

    @Test
    void longestCommonPrefix3() {
        N14_LongestCommonPrefix solution = new N14_LongestCommonPrefix();
        String result = solution.longestCommonPrefix(new String[] {"dog"});
        assertEquals("dog", result);
    }

    @Test
    void longestCommonPrefix4() {
        N14_LongestCommonPrefix solution = new N14_LongestCommonPrefix();
        String result = solution.longestCommonPrefix(new String[] {});
        assertEquals("", result);
    }

    @Test
    void longestCommonPrefix5() {
        N14_LongestCommonPrefix solution = new N14_LongestCommonPrefix();
        String result = solution.longestCommonPrefix(new String[] {"", ""});
        assertEquals("", result);
    }

    @Test
    void longestCommonPrefix6() {
        N14_LongestCommonPrefix solution = new N14_LongestCommonPrefix();
        String result = solution.longestCommonPrefix(new String[] {"flower","flower","flower","flower"});
        assertEquals("flower", result);
    }

}