package com.nkei.n0_1000;

public class N151_ReverseWordsInString {
    public String reverseWords(String s) {
        String[] arr = s.trim().split("\\s+");
        return String.join(" ", reverse(arr));
    }

    private static String[] reverse(String[] arr) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            swap(arr, l++, r--);
        }
        return arr;
    }

    private static void swap(String[] arr, int l, int r) {
        String swap = arr[l];
        arr[l] = arr[r];
        arr[r] = swap;
    }
}
