package com.wj.basic.sort;

/**
 * Created by white_wolf on 2020/6/18.
 *
 * @author thebestwj
 */
/**
 * 归并排序
 * https://www.cnblogs.com/chengxiao/p/6194356.html
 *  O(nlogn)
 */
public class MergeSort implements SortAlgorithm{
    @Override
    public void sort(int[] nums) {
        int N = nums.length;
        int[] aux = new int[N];
        mergeSort(nums,0,N-1,aux);
    }

    static int[] mergeSort(int[] nums,int left ,int right ,int[] aux) {
        if(left<right){
            int mid = (left+right)/2;
            mergeSort(nums,left,mid,aux);//左边归并排序，使得左子序列有序
            mergeSort(nums,mid+1,right,aux);//右边归并排序，使得右子序列有序
            merge(nums,left,mid,right,aux);//将两个有序子数组合并操作
        }
        return nums;
    }

    static int[] merge(int[] nums,int left ,int mid,int right ,int[] aux){
        int i = left;//左序列指针
        int j = mid+1;//右序列指针
        int t = 0;//临时数组指针
        while (i<=mid && j<=right){
            if(nums[i]<=nums[j]){
                aux[t++] = nums[i++];
            }else {
                aux[t++] = nums[j++];
            }
        }
        while(i<=mid){//将左边剩余元素填充进temp中
            aux[t++] = nums[i++];
        }
        while(j<=right){//将右序列剩余元素填充进temp中
            aux[t++] = nums[j++];
        }
        t = 0;
        //将temp中的元素全部拷贝到原数组中
        while(left <= right){
            nums[left++] = aux[t++];
        }
        return nums;
    }
}
