package com.nkei.n1001_2000.test;

import com.nkei.n1001_2000.N1768_MergeStringsAlternately;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class N1768_MergeStringsAlternatelyTest {

    @Test
    void mergeAlternately() {
        N1768_MergeStringsAlternately solution = new N1768_MergeStringsAlternately();
        String result = solution.mergeAlternately("abc", "pqr");
        assertEquals("apbqcr", result);
    }

    @Test
    void mergeAlternately2() {
        N1768_MergeStringsAlternately solution = new N1768_MergeStringsAlternately();
        String result = solution.mergeAlternately("ab", "pqrs");
        assertEquals("apbqrs", result);
    }

    @Test
    void mergeAlternately3() {
        N1768_MergeStringsAlternately solution = new N1768_MergeStringsAlternately();
        String result = solution.mergeAlternately("abcd", "pq");
        assertEquals("apbqcd", result);
    }

    @Test
    void mergeAlternately4() {
        N1768_MergeStringsAlternately solution = new N1768_MergeStringsAlternately();
        String result = solution.mergeAlternately("ab", "pq");
        assertEquals("apbq", result);
    }

    @Test
    void mergeAlternately5() {
        N1768_MergeStringsAlternately solution = new N1768_MergeStringsAlternately();
        String result = solution.mergeAlternately("", "pq");
        assertEquals("pq", result);
    }

    @Test
    void mergeAlternately6() {
        N1768_MergeStringsAlternately solution = new N1768_MergeStringsAlternately();
        String result = solution.mergeAlternately("ab", "");
        assertEquals("ab", result);
    }

    @Test
    void mergeAlternately7() {
        N1768_MergeStringsAlternately solution = new N1768_MergeStringsAlternately();
        String result = solution.mergeAlternately("", "");
        assertEquals("", result);
    }
}