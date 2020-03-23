package com.wj.leetcode.everyday;

/**
 * Created by white_wolf on 2020/3/23.
 *
 * @author thebestwj
 */
public class SwapNumbersLcci {
    public int[] swapNumbers(int[] numbers) {  //why ac? 溢出也没关系
        numbers[0] +=numbers[1];
        numbers[1] = numbers[0] - numbers[1];
        numbers[0] -=numbers[1];
        return numbers;
    }

}
