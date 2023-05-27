package com.nkei.n0_1000.test;

import com.nkei.n0_1000.N238_ProductOfArrayExceptSelf;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class N238_ProductOfArrayExceptSelfTest {

    @Test
    void productExceptSelf() {
        N238_ProductOfArrayExceptSelf solution = new N238_ProductOfArrayExceptSelf();
        int[] result = solution.productExceptSelf(new int[]{1, 2, 3, 4});
        assertArrayEquals(new int[] {24,12,8,6}, result);
    }

    @Test
    void productExceptSelf2() {
        N238_ProductOfArrayExceptSelf solution = new N238_ProductOfArrayExceptSelf();
        int[] result = solution.productExceptSelf(new int[]{-1,1,0,-3,3});
        assertArrayEquals(new int[] {0,0,9,0,0}, result);
    }
}