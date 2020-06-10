package com.wj.leetcode.Q128;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by white_wolf on 2020/6/5.
 *
 * @author thebestwj
 */
//空间换时间
public class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numsSet = new HashSet<>();
        for (Integer num : nums) {
            numsSet.add(num);
        }
        int longest = 0;
        for (Integer num : nums) {
            if (numsSet.remove(num)) {
                // 向当前元素的左边搜索
                int currentLongest = 1;
                int current = num;
                while (numsSet.remove(current - 1)) current--;
                currentLongest += (num - current);
                // 向当前元素的右边搜索
                current = num;
                while (numsSet.remove(current + 1)) current++;
                currentLongest += (current - num);
                // 搜索完后更新longest.
                longest = Math.max(longest, currentLongest);
            }
            if (numsSet.size() == 0) break;
        }
        return longest;
    }
}
