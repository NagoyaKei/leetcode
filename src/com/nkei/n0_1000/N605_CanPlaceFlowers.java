package com.nkei.n0_1000;

/**
 * You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.
 *
 * Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return true if n new
 * flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.
 *
 * example:
 * - new int[]{0, 0, 0, 0, 1}, 2 = true
 * - new int[]{1, 0, 0, 0, 1}, 1 = true
 */
public class N605_CanPlaceFlowers {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int freePlaces = 1; // for left plants
        int seeded = 0;

        for (int flower : flowerbed) {
            if (flower == 1) {
                seeded += (freePlaces - 1) / 2;
                freePlaces = 0;
            } else {
                freePlaces++;
            }
        }
        freePlaces++; // for right plants
        seeded += (freePlaces - 1) / 2;

        return seeded >= n;
    }

}
