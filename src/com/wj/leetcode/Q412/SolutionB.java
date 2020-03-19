package com.wj.leetcode.Q412;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by white_wolf on 2020/3/19.
 *
 * @author thebestwj
 */
public class SolutionB {
    public List<String> fizzBuzz(int n) {
        return IntStream.range(1, n + 1).mapToObj(i -> {
            if (i % 3 == 0 && i % 5 == 0) return "FizzBuzz";
            if (i % 3 == 0) return "Fizz";
            if (i % 5 == 0) return "Buzz";
            return String.valueOf(i);
        }).collect(Collectors.toList());
    }
}
