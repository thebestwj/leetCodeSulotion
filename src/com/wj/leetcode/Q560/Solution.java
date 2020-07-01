package com.wj.leetcode.Q560;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by white_wolf on 2020/6/28.
 *
 * @author thebestwj
 */
public class Solution {
    public int subarraySum(int[] nums, int k) {
        /**
         扫描一遍数组, 使用map记录出现同样的和的次数, 对每个i计算累计和sum并判断map内是否有sum-k
         **/
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0, ret = 0;

        for(int i = 0; i < nums.length; ++i) {
            sum += nums[i];
            if(map.containsKey(sum-k))
                ret += map.get(sum-k);
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }

        return ret;
    }
}
//i~j 的和 == 0~j 的和 - 0~i 的 和
//子问题：0~i 的和