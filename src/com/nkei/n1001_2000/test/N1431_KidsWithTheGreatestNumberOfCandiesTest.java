package com.nkei.n1001_2000.test;

import com.nkei.n1001_2000.N1431_KidsWithTheGreatestNumberOfCandies;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class N1431_KidsWithTheGreatestNumberOfCandiesTest {

    @Test
    void kidsWithCandies() {
        N1431_KidsWithTheGreatestNumberOfCandies solution = new N1431_KidsWithTheGreatestNumberOfCandies();
        List<Boolean> result = solution.kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3);
        assertArrayEquals(new Boolean[] {true, true, true, false, true}, result.toArray(Boolean[]::new));
    }
}