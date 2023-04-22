package com.nkei.n0_1000.test;

import com.nkei.n0_1000.N71_SimplifyPath;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class N71_SimplifyPathTest {

    @Test
    void simplifyPath_no_trailing_slash_after_the_last_directory() {
        N71_SimplifyPath solution = new N71_SimplifyPath();
        var result = solution.simplifyPath("/home/");
        assertEquals("/home", result);
    }

    @Test
    void simplifyPath_root_directory_is_noop() {
        N71_SimplifyPath solution = new N71_SimplifyPath();
        var result = solution.simplifyPath("/../");
        assertEquals("/", result);
    }

    @Test
    void simplifyPath_multiple_consecutive_slashes_are_replaced_by_a_single_one() {
        N71_SimplifyPath solution = new N71_SimplifyPath();
        var result = solution.simplifyPath("/home//foo/");
        assertEquals("/home/foo", result);
    }

    @Test
    void simplifyPath_strong_test() {
        N71_SimplifyPath solution = new N71_SimplifyPath();
        var result = solution.simplifyPath("/a/../b/./c//d/");
        assertEquals("/b/c/d", result);
    }
}