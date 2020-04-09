package com.wj.leetcode.Q48;

/**
 * Created by white_wolf on 2020/4/7.
 *
 * @author thebestwj
 */
public class SolutionC { //same as https://leetcode-cn.com/problems/rotate-matrix-lcci
    public void rotate(int[][] matrix) {
        int len = matrix.length-1;
        int left = 0;
        int right = len;
        int up = 0;
        int down = len;
        while(left < right && up < down){
            for(int i = left; i < right; i++){
                int temp = matrix[len-i][left];
                matrix[len-i][left] = matrix[down][len-i];
                matrix[down][len-i] = matrix[i][right];
                matrix[i][right] = matrix[up][i];
                matrix[up][i] = temp;
            }
            up++;
            down--;
            left++;
            right--;
        }
    }
}
