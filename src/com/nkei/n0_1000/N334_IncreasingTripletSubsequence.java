package com.nkei.n0_1000;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Given an integer array nums, return true if there exists a triple of indices (i, j, k) such that i < j < k and nums[i] < nums[j] < nums[k]. If
 * no such indices exists, return false.
 *
 * Example: [20, 100, 10!, 12!, 5, 13!]
 * return: true
 */
public class N334_IncreasingTripletSubsequence {
    public List<String> iterations = new ArrayList<>();

    public boolean increasingTriplet(int[] nums) {
        int length = nums.length;
        if (length < 3 || length > 500000) {
            return false;
        }

        int left = Integer.MAX_VALUE, right = Integer.MAX_VALUE;
        for (int n : nums) {
            if (n <= left) {
                left = n;
            } else if (n <= right) {
                right = n;
            } else
                return true;
        }

        return false;
    }

    public boolean increasingTriplet4(int[] nums) {
        if (nums.length < 3) {
            return false;
        }

        List<Integer> normalized = getNormalized(nums);
        int i, i2, i3, length = normalized.size();

        for (i = 0; i < length - 2; i++) {
            for (i2 = i + 1; i2 < length - 1; i2++) {
                for (i3 = length - 1; i3 > i2; i3--) {
                    if (normalized.get(i) < normalized.get(i2) && normalized.get(i2) < normalized.get(i3)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    private List<Integer> getNormalized(int[] nums) {
        int length = nums.length;
        List<Integer> normalized = new LinkedList<>();
        normalized.add(nums[0]);

        for (int i = 1; i < length; i++) {
            if (nums[i] != nums[i - 1]) {
                normalized.add(nums[i]);
            }
        }
        return normalized;
    }

    public boolean increasingTriplet3(int[] nums) {
        int length = nums.length;
        if (length < 3) {
            return false;
        }

        int i = 1, j = length - 2, k;
        int left = nums[0], middle = nums[1], right = nums[length - 1], nI, nJ;

        int it = 1;
        iterations.add(String.format("%s: %s_%s_%s", it++, left, middle, right));

        while (i != j) {
            nI = nums[i];
            if (nI < left) {
                left = nI;
                continue;
            } else {
                i++;
            }
            nJ = nums[j];
            if (nJ > right) {
                right = nJ;
                continue;
            } else {
                j--;
            }

            for (k = i + 1; k < j ; k++) {
                middle = nums[k];
                iterations.add(String.format("%s: %s_%s_%s", it++, left, middle, right));
                if (middle >= left && middle <= right) {
                    return true;
                }
            }

            iterations.add(String.format("%s: %s_%s_%s", it++, left, middle, right));
        }

        return middle >= left && middle <= right;
    }

    public boolean increasingTriplet2(int[] nums) {
        int length = nums.length;
        if (length < 3) {
            return false;
        }



        int i, j, k = length - 1;
        int nI, nJ, nK = nums[k];

        // to right
        for (i = 0; i < k - 1; i++) {
            nI = nums[i];
            if (nI > nK) {
                continue;
            }

            for (j = i + 1; j < k; j++) {
                nJ = nums[j];
                if (nJ < nK && nI < nJ) {
                    return true;
                }
            }
        }

        nI = nums[0];

        // to left
        for (k = length - 2; k > 1; k--) {
            nK = nums[k];
            if (nI > nK) {
                continue;
            }

            for (j = 1; j < k; j++) {
                nJ = nums[j];
                if (nJ < nK && nI < nJ) {
                    return true;
                }
            }
        }

        return false;
    }

    /*while (true) {
        int nI = nums[i];
        int nJ = nums[j];
        int nK = nums[k];
        if (nI < nJ) {
            if (nJ < nK) {
                return true;
            } else {
                j++
            }
        }
        if (k < length - 1) {
            k++;
        } else if (j < length - 2) {
            j++;
        } else if (i < length - 3) {
            i++;
        } else {
            return false;
        }
    }*/

}
