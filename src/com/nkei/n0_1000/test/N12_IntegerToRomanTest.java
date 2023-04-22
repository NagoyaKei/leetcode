package com.nkei.n0_1000.test;

import com.nkei.n0_1000.N12_IntegerToRoman;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class N12_IntegerToRomanTest {

    @Test
    void intToRoman_1() {
        N12_IntegerToRoman solution = new N12_IntegerToRoman();
        assertEquals("I", solution.intToRoman(1));
    }

    @Test
    void intToRoman_3() {
        N12_IntegerToRoman solution = new N12_IntegerToRoman();
        assertEquals("III", solution.intToRoman(3));
    }

    @Test
    void intToRoman_4() {
        N12_IntegerToRoman solution = new N12_IntegerToRoman();
        assertEquals("IV", solution.intToRoman(4));
    }

    @Test
    void intToRoman_8() {
        N12_IntegerToRoman solution = new N12_IntegerToRoman();
        assertEquals("VIII", solution.intToRoman(8));
    }

    @Test
    void intToRoman_1994() {
        N12_IntegerToRoman solution = new N12_IntegerToRoman();
        assertEquals("MCMXCIV", solution.intToRoman(1994));
    }

    @Test
    void intToRoman_58() {
        N12_IntegerToRoman solution = new N12_IntegerToRoman();
        assertEquals("LVIII", solution.intToRoman(58));
    }

    @Test
    void intToRoman_60() {
        N12_IntegerToRoman solution = new N12_IntegerToRoman();
        assertEquals("LX", solution.intToRoman(60));
    }

    @Test
    void intToRoman_0() {
        N12_IntegerToRoman solution = new N12_IntegerToRoman();
        assertEquals("", solution.intToRoman(0));
    }
}