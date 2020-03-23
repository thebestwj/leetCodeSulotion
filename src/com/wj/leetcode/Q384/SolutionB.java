package com.wj.leetcode.Q384;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by white_wolf on 2020/3/23.
 *
 * @author thebestwj
 */
public class SolutionB { //Fisher-Yates 洗牌算法
    int[] original;

    public SolutionB(int[] nums) {
        original = nums;
    }

    /**
     * Resets the array to its original configuration and return it.
     */
    public int[] reset() {
        return original;
    }

    /**
     * Returns a random shuffling of the array.
     */
    public int[] shuffle() {
        Random rnd = new Random(System.currentTimeMillis());
        int[] result = Arrays.copyOf(original, original.length);
        for (int i = 0; i < original.length; i++) {
            int temp = result[i];
            int j = rnd.nextInt(original.length - i) + i;
            result[i] = result[j];
            result[j] = temp;
        }
        return result;
    }
}
