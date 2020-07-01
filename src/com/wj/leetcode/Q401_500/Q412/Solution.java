package com.wj.leetcode.Q401_500.Q412;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by white_wolf on 2020/3/19.
 *
 * @author thebestwj
 */
public class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuzz");
                continue;
            }
            if (i % 5 == 0) {
                result.add("Buzz");
                continue;
            }
            if (i % 3 == 0) {
                result.add("Fizz");
                continue;
            }
            result.add(String.valueOf(i));
        }
        return result;
    }
}
