package com.wj.leetcode.Q1248;

/**
 * Created by white_wolf on 2020/4/21.
 *
 * @author thebestwj
 */
public class Solution {
//    public int numberOfSubarrays(int[] nums, int k) {
//        if (nums == null || nums.length <= 0 || nums.length < k) return 0;
//        int res = 0;
//        int[] between = new int[k + 1];
//        int count = 0;
//        int i = 0;
//        while (count < k) {
//            if (nums[i] % 2 == 1) {
//                count++;
//            } else {
//                between[count]++;
//            }
//            i++;
//            if (i >= nums.length) return count == k ? (between[0] + 1) * (between[k] + 1) : 0;
//        }
//        while (true) {
//            res = res + (between[0] + 1) * (between[k] + 1);
//            System.arraycopy(between, 1, between, 0, k);
//            between[k] = 0;
//            i++;
//            if (i >= nums.length) return res + (between[0] + 1) * (between[k] + 1);
//            while (nums[i] % 2 == 0) {
//                System.out.println(i);
//                between[k]++;
//                i++;
//                if (i >= nums.length) return res + (between[0] + 1) * (between[k] + 1);
//            }
//
//        }
//    }

    public int numberOfSubarrays(int[] nums, int k) {
        int left = 0, right = 0, oddCnt = 0, res = 0;
        while (right < nums.length) {
            // 右指针先走，每遇到一个奇数则 oddCnt++。
            if ((nums[right++] & 1) == 1) {
                oddCnt++;
            }

            //  若当前滑动窗口 [left, right) 中有 k 个奇数了，进入此分支统计当前滑动窗口中的优美子数组个数。
            if (oddCnt == k) {
                // 先将滑动窗口的右边界向右拓展，直到遇到下一个奇数（或出界）
                // rightEvenCnt 即为第 k 个奇数右边的偶数的个数
                int tmp = right;
                while (right < nums.length && (nums[right] & 1) == 0) {
                    right++;
                }
                int rightEvenCnt = right - tmp;
                // leftEvenCnt 即为第 1 个奇数左边的偶数的个数
                int leftEvenCnt = 0;
                while ((nums[left] & 1) == 0) {
                    leftEvenCnt++;
                    left++;
                }
                // 第 1 个奇数左边的 leftEvenCnt 个偶数都可以作为优美子数组的起点
                // (因为第1个奇数左边可以1个偶数都不取，所以起点的选择有 leftEvenCnt + 1 种）
                // 第 k 个奇数右边的 rightEvenCnt 个偶数都可以作为优美子数组的终点
                // (因为第k个奇数右边可以1个偶数都不取，所以终点的选择有 rightEvenCnt + 1 种）
                // 所以该滑动窗口中，优美子数组左右起点的选择组合数为 (leftEvenCnt + 1) * (rightEvenCnt + 1)
                res += (leftEvenCnt + 1) * (rightEvenCnt + 1);

                // 此时 left 指向的是第 1 个奇数，因为该区间已经统计完了，因此 left 右移一位，oddCnt--
                left++;
                oddCnt--;
            }

        }

        return res;
    }
}
