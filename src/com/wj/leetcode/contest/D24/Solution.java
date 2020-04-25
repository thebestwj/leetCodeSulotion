package com.wj.leetcode.contest.D24;

import java.util.ArrayList;

/**
 * Created by white_wolf on 2020/4/18.
 *
 * @author thebestwj
 */
public class Solution {

    public int minStartValue(int[] nums) { //AC
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            sum = sum + nums[i];
            if (sum < min) min = sum;
        }
        return -min + 1 > 0 ? -min + 1 : 1;
    }

    public int findMinFibonacciNumbers(int k) {//AC
        int[] f = new int[46];
        f[0] = 1;
        f[1] = 2;
        int i = 0;
        int res = 0;
        do {
            f[i + 2] = f[i] + f[i + 1];
            i++;
        } while (f[i + 1] <= k);
        for (int j = i; j >= 0; j--) {
            if (f[j] <= k) {
                k = k - f[j];
                res++;
            }
            if (k == f[j]) return ++res;
            if (k == 0) return res;
        }
        return res;
    }

    public String getHappyString(int n, int k) {//AC
        int portion = (int) Math.pow(2, n - 1);
        if (k > 3 * portion) return "";
        ArrayList<String> all = new ArrayList<>();
        all.add("a");
        all.add("b");
        all.add("c");
        for (int i = 1; i < n; i++) {
            ArrayList<String> temp = new ArrayList<>();
            for (String s : all) {
                switch (s.charAt(s.length() - 1)) {
                    case 'a':
                        temp.add(s + "b");
                        temp.add(s + "c");
                        break;
                    case 'b':
                        temp.add(s + "a");
                        temp.add(s + "c");
                        break;
                    case 'c':
                        temp.add(s + "a");
                        temp.add(s + "b");
                        break;
                }
            }
            all = temp;
        }
        return all.get(k - 1);

    }

    public int numberOfArrays(String s, int k) {
        if (s.length() < 1) return 0;
        if (s.length() == 1) return 1;
        final int MAGIC = 1000000007;
        ArrayList<Integer> list = new ArrayList<>();
        long last = s.charAt(0) - '0';
        for (int i = 1; i < s.length(); i++) {
            int now = s.charAt(i) - '0';
            if (now == 0) {
                last = last * 10;
                if (last >= MAGIC) last -= MAGIC;
            } else {
                if (last > k) return 0;
                else list.add((int) last);
            }
            last = now;
        }
        list.add((int) last);
        int res = list.size();


        for (int l = 1; l <= String.valueOf(k).length(); l++) {
            for (int i = 0; i <= s.length() - l; i++) {
                String sub = s.substring(i, i + l);
                if (Integer.parseInt(s) < k) ;
            }
        }

        return res;

    }
}
