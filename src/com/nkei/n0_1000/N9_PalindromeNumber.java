package com.nkei.n0_1000;

public class N9_PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        char[] arr = (x + "").toCharArray();
        int l = arr.length;
        if (l <= 3 && arr[0] != arr[l - 1]) {
            return false;
        }
        for (int i = 0; i < l / 2; i++) {
            if (arr[i] != arr[l - i - 1]) {
                return false;
            }
        }
        return true;
    }
}
