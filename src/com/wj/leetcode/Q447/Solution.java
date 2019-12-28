package com.wj.leetcode.Q447;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by white_wolf on 2019/12/28.
 *
 * @author thebestwj
 */
public class Solution {
    public int numberOfBoomerangs(int[][] points) {
        int count = 0;

        for (int i = 0; i < points.length; i++) {
            HashMap<Double, Integer> len = new HashMap<>();
            System.out.println(points[i][0] + " , " + points[i][1]);
            for (int j = 0; j < points.length; j++) {
                if (i == j) continue;
                Double cal = Math.sqrt(Math.pow(points[i][0] - points[j][0], 2) + Math.pow(points[i][1] - points[j][1], 2));
                if (len.containsKey(cal)) {
                    len.put(cal, len.get(cal) + 1);
                } else
                    len.put(cal, 1);
            }
            for (Map.Entry<Double, Integer> entry : len.entrySet()
            ) {
                if (entry.getValue() >= 2) count = count + entry.getValue() * (entry.getValue() - 1);
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }

        }

        return count;
    }
}
