package com.wj.leetcode.contest.W183;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by white_wolf on 2020/4/5.
 *
 * @author thebestwj
 */
public class Solution {
    public List<Integer> minSubsequence(int[] nums) { //AC
        if(nums.length<1) return null;
        Arrays.sort(nums);
        int sum = 0;
        for(int i:nums){
            sum+=i;
        }
        int subsum=0;
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = nums.length-1;i>=0;i--){
            subsum+= nums[i];
            sum-= nums[i];
            result.add(nums[i]);
            if(subsum>sum) return result;
        }
        return result;
    }

    public int numSteps(String s) { //AC 比那种无脑BigInteger的好
        int start = 0;
        char prev ='0';
        int step= 0;
        for (; start < s.length() - 1; start++) {
            if(s.charAt(start)=='1') break;
        }
        for(int i = s.length()-1;i>start;i--) {
            if (s.charAt(i) == '0') {
                step++;
                if(prev=='1'){
                    prev='1';
                    step++;
                }else prev='0';
            }
            if (s.charAt(i) == '1'){
                if(prev=='0') step++;
                step++;
                prev='1';
            }
        }
        if (prev=='1') step+=2;
        return step;
    }

    public String longestDiverseString(int a, int b, int c) {
        StringBuffer sb = new StringBuffer("");
        int ag = a/2 ;
        int bg = b/2 ;
        int cg=  c/2 ;

        boolean aSingle = false;
        boolean bSingle = false;
        boolean cSingle = false;

        if(a%2==1) aSingle = true;
        if(b%2==1) aSingle = true;
        if(c%2==1) aSingle = true;

        int as=aSingle?ag+1:ag;
        int bs=bSingle?bg+1:bg;
        int cs=cSingle?cg+1:cg;

        if(Math.max(ag,Math.max(bg,cg))==0) {
            if(aSingle)sb.append("a");
            if(bSingle)sb.append("b");
            if(cSingle)sb.append("c");
            return sb.toString();
        }

        if(as>bs+cs+1) {as=bs+cs+1;aSingle=false;}
        if(bs>as+cs+1) {bs=as+cs+1;bSingle=false;}
        if(cs>bs+as+1) {cs=bs+as+1;cSingle=false;}

        char prev='c';
        if(as==bs+cs+1){sb.append("aa");prev='a';as--;}
        else if(bs==as+cs+1){sb.append("bb");prev='b';bs--;}
        else if(cs==bs+as+1){sb.append("cc");prev='c';cs--;}
        else {sb.append("aa");prev='a';as--;}

        for(;;){
            if(as==0&&bs==0&&cs==0) break;
            switch (prev){
                case 'a':
                    if(bs!=0){
                        if(bs==1 && bSingle)sb.append("b");
                        else sb.append("bb");
                        prev='b';
                        bs--;
                    }else{
                        if(cs==1 && cSingle)sb.append("c");
                        else sb.append("cc");
                        prev='c';
                        cs--;
                    }
                    break;
                case 'b':
                    if(as!=0){
                        if(as==1 && aSingle)sb.append("a");
                        else sb.append("aa");
                        prev='a';
                        as--;
                    }else{
                        if(cs==1 && cSingle)sb.append("c");
                        else sb.append("cc");
                        prev='c';
                        cs--;
                    }
                    break;
                case'c':
                    if(as!=0){
                        if(as==1 && aSingle)sb.append("a");
                        else sb.append("aa");
                        prev='a';
                        as--;
                    }else{
                        if(bs==1 && bSingle)sb.append("b");
                        else sb.append("bb");
                        prev='b';
                        bs--;
                    }
                    break;
            }
        }

        String res = sb.toString();
        return res;

    }
}
