package com.wj.leetcode.everyday;

/**
 * Created by white_wolf on 2020/3/20.
 *
 * @author thebestwj
 */

// O(logn)
public class FirstBadVersion {
    public int firstBadVersion(int n) {
        if(n<=1) return 1;
        int s = 1;
        while(n-s>1){
            if(isBadVersion((n-s)/2+s)){   //(n+s)/2 会导致溢出
                n = (n-s) / 2+s;
            }else{
                s = (n-s) / 2+s;
            }
        }
        return isBadVersion(s)?s:n;
    }

    boolean isBadVersion(int version) {
        return false;
    }
}
