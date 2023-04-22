package com.nkei.n0_1000;

public class N1_TwoSum {

    public int[] twoSum(int[] nums, int target) {
        for (int a = 0; a < nums.length; a++) {
            for (int b = a + 1; b < nums.length; b++) {
                if (nums[a] + nums[b] == target) {
                    return new int[] {a, b};
                }
            }
        }

        return new int[] {-1, -1};
    }
}
