package com.wj.leetcode;

import com.wj.leetcode.Q26.SolutionB;

public class Main {

    private static SolutionB solution;

    public static void main(String[] args) {
	// write your code here
        solution = new SolutionB();
        System.out.println(solution.removeDuplicates(new int[]{1,2,2,3,3,3,4,4,4}));
    }
}
