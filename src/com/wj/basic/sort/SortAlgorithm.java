package com.wj.basic.sort;

/**
 * Created by white_wolf on 2020/6/18.
 *
 * @author thebestwj
 */
public interface SortAlgorithm {
    void sort(int[] nums);
    default void swap(int[] nums,int a,int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
