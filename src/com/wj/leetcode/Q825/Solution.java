package com.wj.leetcode.Q825;

/**
 * Created by white_wolf on 2019/12/28.
 *
 * @author thebestwj
 */
public class Solution {
    public int numFriendRequests(int[] ages) {
        int count = 0;
        int[] peo = new int[121];
        for (int age : ages) {
            peo[age]++;
        }
        for (int i = 1; i <= 120; i++) {
            if (peo[i] == 0) continue;
            for (int j = 1; j <= 120; j++) {
                if (peo[j] == 0) continue;
                if (i == j && peo[j] == 1) continue;
                if (!((j <= 0.5 * i + 7) || (j > i) )) {
                    System.out.println(i + ":" + peo[i] + " --> " + j + ":" + peo[j] + " " + peo[i] * peo[j]);
                    if (i == j) {
                        count = count + peo[i] * (peo[j] - 1);
                    } else {
                        count = count + peo[i] * peo[j];
                    }
                }
            }

        }
        return count;
    }
}
