package com.wj.basic.sort;

/**
 * Created by white_wolf on 2020/6/18.
 *
 * @author thebestwj
 */

/**
 * 堆排序
 * 平均时间复杂度为 Ο(nlogn)
 */
// 堆的存储结构 root,root.l,root.r,root.l.l,root.l.r,root.r.l,root.r.r
public class HeapSort implements SortAlgorithm {
    @Override
    public void sort(int[] nums) {
        int len = nums.length;

        buildMaxHeap(nums, len);

        for (int i = len - 1; i > 0; i--) {
            swap(nums, 0, i);   //堆顶为最大，交换最后一个和最大值
            len--;
            heapify(nums, 0, len);
        }
    }

    private void buildMaxHeap(int[] nums, int len) {
        for (int i = (int) Math.floor(len / 2); i >= 0; i--) { //需要Math.floor
            heapify(nums, i, len);
        }
    }

    private void heapify(int[] nums, int i, int len) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int largest = i;

        if (left < len && nums[left] > nums[largest]) {
            largest = left;
        }

        if (right < len && nums[right] > nums[largest]) {
            largest = right;
        }

        if (largest != i) {
            swap(nums, i, largest);
            heapify(nums, largest, len);
        }
    }
}
