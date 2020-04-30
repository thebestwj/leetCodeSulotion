package com.wj.leetcode.Q1_100.Q48;

/**
 * Created by white_wolf on 2019/10/2.
 *
 * @author thebestwj
 */
public class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i = 0 ;i < n / 2 ; i++){
            rotateOnelevel(matrix,i,n);
        }
    }

    private void rotateOnelevel(int[][]matrix,int i,int n){
        for (int k = 0 ; k < n - i * 2 - 1 ; k++ ){
            for (int j = 0 ; j < n - i * 2 - 1 ; j++){
                swap(matrix,i,i,i,i+j+1);
            }
            for (int j = 0 ; j < n - i * 2 - 1; j++){
                swap(matrix,i,i,i+j+1,n-i-1);
            }
            for (int j = 0 ; j < n - i * 2 - 1; j++){
                swap(matrix,i,i,n-i-1,n-i-j-2);
            }
            for (int j = 0 ; j < n - i * 2 - 1; j++){
                swap(matrix,i,i,n-i-j-2,i);
            }
        }


    }

    private void swap(int[][] nums,int AfirstIndex,int AsecondIndex,int BfirstIndex,int BsecondIndex){
        int temp = nums[AfirstIndex][AsecondIndex];
        nums[AfirstIndex][AsecondIndex] = nums[BfirstIndex][BsecondIndex] ;
        nums[BfirstIndex][BsecondIndex] = temp;
    }
}
