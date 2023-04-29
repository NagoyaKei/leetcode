package com.nkei.n0_1000.test;

import com.nkei.n0_1000.N605_CanPlaceFlowers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class N605_CanPlaceFlowersTest {

    @Test
    void canPlaceFlowers() {
        N605_CanPlaceFlowers solution = new N605_CanPlaceFlowers();
        boolean result = solution.canPlaceFlowers(new int[]{1, 0, 0, 0, 0, 0, 1}, 2);
        assertEquals(true, result);
    }

    @Test
    void canPlaceFlowers2() {
        N605_CanPlaceFlowers solution = new N605_CanPlaceFlowers();
        boolean result = solution.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 2);
        assertEquals(false, result);
    }

    @Test
    void canPlaceFlowers3() {
        N605_CanPlaceFlowers solution = new N605_CanPlaceFlowers();
        boolean result = solution.canPlaceFlowers(new int[]{1, 0, 0, 0, 0,  1}, 2);
        assertEquals(false, result);
    }

    @Test
    void canPlaceFlowers4() {
        N605_CanPlaceFlowers solution = new N605_CanPlaceFlowers();
        boolean result = solution.canPlaceFlowers(new int[]{1, 0, 1, 0, 1, 0, 1}, 0);
        assertEquals(true, result);
    }

    @Test
    void canPlaceFlowers5() {
        N605_CanPlaceFlowers solution = new N605_CanPlaceFlowers();
        boolean result = solution.canPlaceFlowers(new int[]{0, 0, 1, 0, 1}, 1);
        assertEquals(true, result);
    }

    @Test
    void canPlaceFlowers6() {
        N605_CanPlaceFlowers solution = new N605_CanPlaceFlowers();
        boolean result = solution.canPlaceFlowers(new int[]{0, 0, 0, 0, 1}, 2);
        assertEquals(true, result);
    }

    @Test
    void canPlaceFlowers7() {
        N605_CanPlaceFlowers solution = new N605_CanPlaceFlowers();
        boolean result = solution.canPlaceFlowers(new int[]{1, 0, 0, 0, 1, 0, 0}, 2);
        assertEquals(true, result);
    }

    @Test
    void canPlaceFlowers8() {
        N605_CanPlaceFlowers solution = new N605_CanPlaceFlowers();
        boolean result = solution.canPlaceFlowers(new int[]{0, 0, 0}, 1);
        assertEquals(true, result);
    }
}