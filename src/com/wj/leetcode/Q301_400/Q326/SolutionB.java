package com.wj.leetcode.Q301_400.Q326;

/**
 * Created by white_wolf on 2020/3/17.
 *
 * @author thebestwj
 */
public class SolutionB {  //硬编码
    public boolean isPowerOfThree(int n) {
        if (n == 1 || n == 3 || n == 9 || n == 27 || n == 81 || n == 243 || n == 729 || n == 2187 || n == 6561 || n == 19683 || n == 59049 || n == 177147 || n == 531441 || n == 1594323 || n == 4782969 || n == 14348907 || n == 43046721 || n == 129140163 || n == 387420489 || n == 1162261467) {
            return true;
        } else {
            return false;
        }
    }
}
