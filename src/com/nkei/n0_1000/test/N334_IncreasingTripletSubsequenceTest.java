package com.nkei.n0_1000.test;

import com.nkei.n0_1000.N334_IncreasingTripletSubsequence;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class N334_IncreasingTripletSubsequenceTest {

    @Test
    void increasingTriplet() {
        N334_IncreasingTripletSubsequence solution = new N334_IncreasingTripletSubsequence();
        boolean result = solution.increasingTriplet(new int[]{1, 2, 3, 4, 5});
        assertEquals(true, result);
    }

    @Test
    void increasingTriplet2() {
        N334_IncreasingTripletSubsequence solution = new N334_IncreasingTripletSubsequence();
        boolean result = solution.increasingTriplet(new int[]{5, 4, 3, 2, 1});
        assertEquals(false, result);
    }

    @Test
    void increasingTriplet3() {
        N334_IncreasingTripletSubsequence solution = new N334_IncreasingTripletSubsequence();
        boolean result = solution.increasingTriplet(new int[]{2, 1, 5, 0, 4, 6});
        assertEquals(true, result);
    }

    @Test
    void increasingTriplet4() {
        N334_IncreasingTripletSubsequence solution = new N334_IncreasingTripletSubsequence();
        boolean result = solution.increasingTriplet(new int[]{20, 100, 10, 12, 5, 13});
        assertEquals(true, result);
    }

    @Test
    void increasingTriplet5() {
        N334_IncreasingTripletSubsequence solution = new N334_IncreasingTripletSubsequence();
        boolean result = solution.increasingTriplet(new int[]{4, 5, 2147483647, 1, 2});
        assertEquals(true, result);
    }

    @Test
    void increasingTriplet6() {
        N334_IncreasingTripletSubsequence solution = new N334_IncreasingTripletSubsequence();
        boolean result = solution.increasingTriplet(new int[]{5, 1, 6});
        assertEquals(false, result);
    }

    @Test
    void increasingTriplet7() {
        N334_IncreasingTripletSubsequence solution = new N334_IncreasingTripletSubsequence();
        boolean result = solution.increasingTriplet(new int[]{0, 4, 2, 1, 0, -1, -3});
        assertEquals(false, result);
    }

    @Test
    void increasingTriplet8() {
        N334_IncreasingTripletSubsequence solution = new N334_IncreasingTripletSubsequence();
        boolean result = solution.increasingTriplet(new int[]{20, 100, 10, 12, 5, 13});
        assertEquals(true, result);
    }
}