package com.wj.leetcode.contest.W182;


/**
 * Created by white_wolf on 2020/3/29.
 *
 * @author thebestwj
 */
public class Solution {
    public int findLucky(int[] arr) { //AC
     int count[] = new int[501];
        for(int i :arr){
            count[i]++;
        }
        for(int j =500;j>0;j--){
            if (count[j]==j) return j;
        }
        return -1;
    }

    public int numTeams(int[] rating) { //AC
        int n = rating.length;
        if(n<3) return 0;
        int res = 0;
        for(int i = 0;i<n;i++){
            int a = rating[i];
            for(int j = i+1; j<n;j++){
                int b = rating[j];
                for(int k = j+1;k<n;k++){
                    int c =rating[k];
                    if (a<b && b<c) res++;
                    if (a>b && b>c) res++;
                }
            }
        }

        return res;
    }


    //大致思路 转换成26进制数
    public int findGoodStrings(int n, String s1, String s2, String evil) {
        int dif = n;
        int res =0;
        for (int i =0;i<n;i++){
            if (s1.charAt(i)!=s2.charAt(i)) dif = i;
        }
        String common = s1.substring(0,n);
        if (common.contains(evil)) return 0;
        for(int i =Math.min(common.length(),evil.length());i>=0;i--){
            if (evil.substring(0,i).equals(common.substring(common.length()-i,common.length()))){
                evil = evil.substring(i,evil.length()-i);
                break;
            };
        }
        res =res+(n-dif)*26 - s1.charAt(dif) + 'a' - 'z' + s2.charAt(dif)+2;
        return res;
    }

}

class Mystr implements Comparable{
    int[] arr;
    Mystr(String s){
        arr = new int[s.length()];
        for(int i=0;i<s.length();i++){
            arr[i] = s.charAt(i) - 'a';
        }
    }

    @Override
    public int compareTo(Object o) {
        Mystr o2 = (Mystr) o;
        for(int i=0;i<this.arr.length;i++){
            if(arr[i]>o2.arr[i]) return 1;
            if(arr[i]<o2.arr[i]) return -1;
        }
        return 0;
    }
}