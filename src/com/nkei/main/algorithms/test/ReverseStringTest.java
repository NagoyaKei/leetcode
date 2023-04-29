package com.nkei.main.algorithms.test;

import com.nkei.main.algorithms.ReverseString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseStringTest {

    @Test
    void reverseString() {
        ReverseString reverseString = new ReverseString();
        String result = reverseString.reverseString("Some string");
        assertEquals("gnirts emoS", result);
    }
}