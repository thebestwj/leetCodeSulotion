package com.wj.leetcode.everyday.lcof;

/**
 * Created by white_wolf on 2020/4/28.
 *
 * @author thebestwj
 */
public class SingleNumbersLcof {
    //要求space O(1) time O(n)

    public int[] singleNumbers(int[] nums) {  //你要说这个nums给了范围，那也可以算space o(1)
        int[] result=new int[2];
        int h=0;
        int[] c=new int[10001];
        for(int i:nums){
            c[i]++;
        }
        for(int i=1;i<=10000;i++){
            if (c[i]==1) result[h++] = i;
        }
        return result;
    }

    public int[] singleNumbers2(int[] nums) {  //异或 求两个数 可以先通过mask分组
        //用于将所有的数异或起来
        int k = 0;

        for(int num: nums) {
            k ^= num;
        }

        //获得k中最低位的1
        int mask = 1;

        while((k & mask) == 0) {
            mask <<= 1;
        }

        int a = 0;
        int b = 0;

        for(int num: nums) {
            if((num & mask) == 0) {
                a ^= num;
            } else {
                b ^= num;
            }
        }

        return new int[]{a, b};
    }

    public int[] singleNumbers3(int[] nums) { //异或加二分 O(N∗log(maxValue−minValue))
        int sum = 0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, zeroCount = 0;
        for (int num : nums) {
            if (num == 0) {
                zeroCount += 1;
            }
            min = Math.min(min, num);
            max = Math.max(max, num);
            sum ^= num;
        }
        // 需要特判一下某个数是0的情况。
        if (zeroCount == 1) {
            return new int[]{sum, 0};
        }
        int lo = min, hi = max;
        while (lo <= hi) {
            // 根据 lo 的正负性来判断二分位置怎么写，防止越界。
            int mid = lo < 0 ? lo + hi >> 1 : lo + (hi - lo) / 2;
            int loSum = 0, hiSum = 0;
            for (int num : nums) {
                if (num <= mid) {
                    loSum ^= num;
                } else {
                    hiSum ^= num;
                }
            }
            if (loSum != 0 && hiSum != 0) {
                // 两个都不为0，说明 p 和 q 分别落到2个数组里了。
                return new int[]{loSum, hiSum};
            }
            if (loSum == 0) {
                // 说明 p 和 q 都比 mid 大，所以比 mid 小的数的异或和变为0了。
                lo = mid;
            } else {
                // 说明 p 和 q 都不超过 mid
                hi = mid;
            }
        }
        // 其实如果输入是符合要求的，程序不会执行到这里，为了防止compile error加一下
        return null;
    }

}
