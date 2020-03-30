package com.wj.leetcode.everyday;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by white_wolf on 2020/3/30.
 *
 * @author thebestwj
 */
public class JosephusProblem {
    public int lastRemaining(int n, int m) {   //暴力模拟
        List<Integer> list = new ArrayList<>();
        for(int i =0;i<n;i++){
            list.add(i);
        }
        int step=0;
        while(list.size()>1){
            step = (step + m-1) % list.size();
            list.remove(step);
        }
        if(list.size()==1) return list.get(0);
        else return 0;
    }

    public int lastRemaining2(int n, int m) {   //数学
        int ans = 0;
        // 最后一轮剩下2个人，所以从2开始反推
        for (int i = 2; i <= n; i++) {
            ans = (ans + m) % i;
        }
        return ans;
    }

}
