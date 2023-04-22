package com.nkei.main.algorithms.fact.test;

import com.nkei.main.algorithms.fact.Factorial;
import com.nkei.main.algorithms.fact.FactorialCommon;
import com.nkei.main.algorithms.fact.FactorialRecursive;
import com.nkei.main.test.helpers.TimingExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(TimingExtension.class)
class FactorialCommonTest {

    @Test
    public void testFactorialCommon_10() {
        Factorial fact = new FactorialCommon();
        long result = fact.get(10);
        assertEquals(3628800L, result);
    }

    @Test
    public void testFactorialRecursive_10() {
        Factorial fact = new FactorialRecursive();
        long result = fact.get(10);
        assertEquals(3628800L, result);
    }

    @Test
    public void testFactorialCommon_max_long() {
        Factorial fact = new FactorialCommon();
        long result = fact.get(20);
        assertEquals(2_432_902_008_176_640_000L, result);
    }

    @Test
    public void testFactorialRecursive_max_long() {
        Factorial fact = new FactorialRecursive();
        long result = fact.get(20);
        assertEquals(2_432_902_008_176_640_000L, result);
    }

    // @Test
    // public void testFactorialModulo_max_long() {
    //     FactorialModulo fact = new FactorialModulo();
    //     long result = fact.get(20, 10);
    //     assertEquals(2_432_902_008_176_640_000L, result);
    // }


}