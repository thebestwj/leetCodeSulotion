package com.wj.leetcode.contest.W195;

import java.math.BigDecimal;
import java.util.*;

/**
 * Created by white_wolf on 2020/6/28.
 *
 * @author thebestwj
 */
public class Solution {
    public boolean isPathCrossing(String path) {
        int x=0,y=0;
        HashSet<P> s = new HashSet<>();
        P q = new P();
        s.add(q);
        for(char c:path.toCharArray()){
            if(c=='N') y+=1;
            else if(c=='S') y-=1;
            else if(c=='E') x+=1;
            else if(c=='W') x-=1;
            P p = new P();
            p.x = x;
            p.y = y;
            if(s.contains(p)) return true;
            s.add(p);
        }
        return false;
    }
    class P{
        public int x;
        public int y;

        @Override
        public int hashCode() {
            return x + y ;
        }

        @Override
        public boolean equals(Object obj) {
            P p = (P) obj;
            return x==p.x && y==p.y;
        }
    }

    public boolean canArrange(int[] arr, int k) {
        int n = arr.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            arr[i] = arr[i] % k;
            if(map.containsKey(-arr[i])){
                int v = map.get(-arr[i]);
                if(v-1==0) map.remove(-arr[i]);
                else map.put(-arr[i],v-1);
            }else {
                int v = map.getOrDefault(arr[i], 0);
                map.put(arr[i], v + 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry:map.entrySet()){
            int key = entry.getKey();
            int v = entry.getValue();
            if (key==0){
                if (v%2!=0) return false;
            }
            if (key>0){
                if (map.getOrDefault(k-key,0)!=v &&
                        map.getOrDefault(-key,0)!=v)return false;
            }
            if (key<0){
                if (map.getOrDefault(-k-key,0)!=v &&
                map.getOrDefault(-key,0)!=v)return false;
            }
        }
        return true;
    }

    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int MOD = 1000000000+7;
        int l=0;
        long res = 0;
        for (int r = 0; r < nums.length; r++) {
            l=0;
            if(nums[r]>target) break;
            while (l<=r && nums[l]+nums[r]<=target){
                int between = r-l-1;
                int temp = 1;
                while (between>31){
                    between-=31;
                    //temp = temp * Math.pow(2,r-l-1);
                }
                res+= Math.pow(2,r-l-1);
                if(r==l) res++;
                if(res>MOD) res-=MOD;
                l++;
            }
        }
        return (int) (res % MOD);
    }
}
