package com.wj.leetcode;

import com.wj.leetcode.Q48.Solution;

public class Main {

    private static Solution solution = new Solution();

    public static void main(String[] args) {
	// write your code here
        int[][] m = new int[3][3];
        for (int i = 0; i < 9;i++){
            m[i/3][i%3] = i;
        }
        solution.rotate(m);
        for (int i = 0; i < 9;i++){
            System.out.println(m[i/3][i%3]);
        }
    }

    private static  void swap(int[] nums,int a,int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
