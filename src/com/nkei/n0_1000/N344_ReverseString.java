package com.nkei.n0_1000;

public class N344_ReverseString {
    public void reverseString(char[] s) {
        int len = s.length;
        int l = 0;
        int r = len - 1;
        char swap;
        while (l <= r) {
            swap = s[l];
            s[l] = s[r];
            s[r] = swap;
            l++;
            r--;
        }
    }
}
