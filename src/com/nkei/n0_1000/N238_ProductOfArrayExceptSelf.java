package com.nkei.n0_1000;

/**
 * Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
 *
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 *
 * You must write an algorithm that runs in O(n) time and without using the division operation.
 *
 * 2 <= nums.length <= 10^5
 * -30 <= nums[i] <= 30
 *
 * Example 1:
 * Input: nums = [1,2,3,4]
 * Output: [24,12,8,6]
 */
public class N238_ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int i, j, len = nums.length;
        int[] fromLeft = new int[len];
        int[] fromRight = new int[len];
        int[] result = new int[len];

        fromLeft[0] = fromRight[len - 1] = 1;

        for (i = 1, j = len - 2; i < len || j >= 0; i++, j--) {
            fromLeft[i] = nums[i - 1] * fromLeft[i - 1];
            fromRight[j] = nums[j + 1] * fromRight[j + 1];
        }

        for (i = 0; i < len; i++) {
            result[i] = fromLeft[i] * fromRight[i];
        }

        return result;
    }
}
