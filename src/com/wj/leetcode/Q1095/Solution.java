package com.wj.leetcode.Q1095;

/**
 * Created by white_wolf on 2020/4/29.
 *
 * @author thebestwj
 */
public class Solution {  //二分  要注意边界情况
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();
        if(n<=0) return -1;
        int start = 0;
        int end = n -1;
        return find(target,mountainArr,0,n-1);
    }

    private int find(int target, MountainArray mountainArr,int start,int end){
        if(start>end) return -1;
        int mid = (start + end)/2;
        int startNum = mountainArr.get(start);
        int midNum = mountainArr.get(mid);
        int endNum = mountainArr.get(end);
        // System.out.println("find("+ start+ "," + end  +")"+ startNum +","+midNum + "," + endNum);
        if(target == startNum) return start;
        if(target == midNum) return mid;
        if(target == endNum) return end;
        if(midNum>=endNum && startNum>=midNum){
            //if(target>startNum || target<endNum) return -1;  //坑
            if(target>midNum) return find(target,mountainArr,start+1,mid-1);
            else return find(target,mountainArr,mid+1,end-1);
        }
        if(midNum<=endNum && startNum<=midNum){
            //if(target>endNum || target<startNum) return -1; //坑
            if(target>midNum) return find(target,mountainArr,mid+1,end-1);
            else return find(target,mountainArr,start+1,mid-1);
        }
        if(midNum>=startNum && midNum>=endNum){

            int a = find(target,mountainArr,start+1,mid-1);
            int b = find(target,mountainArr,mid+1,end-1);
            if(a==-1){
                if(b==-1){
                    return -1;
                }else {
                    return b;}
            }else{
                if(b==-1){
                    return a;
                }else{
                    return Math.min(a,b);
                }
            }
        }
        return -1;
    }
}

interface MountainArray {
    public int get(int index);
    public int length();
}