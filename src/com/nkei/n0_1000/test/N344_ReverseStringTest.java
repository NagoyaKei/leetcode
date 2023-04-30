package com.nkei.n0_1000.test;

import com.nkei.n0_1000.N344_ReverseString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class N344_ReverseStringTest {

    @Test
    void reverseString() {
        N344_ReverseString solution = new N344_ReverseString();
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        solution.reverseString(s);
        assertArrayEquals(new char[] {'o','l','l','e','h'}, s);
    }
}