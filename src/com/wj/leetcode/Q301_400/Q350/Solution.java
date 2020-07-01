package com.wj.leetcode.Q301_400.Q350;

import java.util.ArrayList;

/**
 * Created by white_wolf on 2019/10/1.
 * @author thebestwj
 */

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList arr1,arr2;
        arr1 = new ArrayList();
        arr2 = new ArrayList();
        for (int i = 0;i < nums1.length; i++){
            arr1.add(nums1[i]);
        }

        for (int i = 0;i < nums2.length; i++) {
            if (arr1.contains(nums2[i])) {
                arr2.add(nums2[i]);
                arr1.remove((Object) nums2[i]);  //object
            }

        }
        int [] result= new int[arr2.size()];
        for (int i = 0; i < arr2.size(); i++){
            result[i] = (int) arr2.get(i);
        }
        return result;
    }
}