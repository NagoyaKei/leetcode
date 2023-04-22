package com.nkei.n0_1000.test;

import com.nkei.n0_1000.N13_RomanToInteger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class N13_RomanToIntegerTest {

    @Test
    void romanToInt() {
        N13_RomanToInteger solution = new N13_RomanToInteger();
        int result = solution.romanToInt("MCMXCIV");
        assertEquals(1994, result);
    }
}