package com.wj.leetcode.contest.W192;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Created by white_wolf on 2020/6/7.
 *
 * @author thebestwj
 */
public class Solution {


    //AC
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[2*n];
        for (int i=0;i<n;i++){
            res[2*i] = nums[i];
            res[2*i + 1] = nums[n+i];
        }
        return res;
    }


    //AC
    public int[] getStrongest(int[] arr, int k) {
        if(k<1) return null;
        Arrays.sort(arr);
        int mid = arr[(arr.length-1)/2];
        int[] ans = new int[k];
        int more = arr.length-1;
        int less = 0;
        int count =0;
        while (count<k&& more>=less){
            int right = Math.abs(arr[more]-arr[mid]);
            int left = Math.abs(arr[less]-arr[mid]);
            System.out.println(right+":"+left);
            if(right>=left){
                ans[count++] = arr[more];
                more--;
            }else{
                ans[count++] = arr[less];
                less++;
            }
        }
        return ans;
    }

    //听说应该是三维dp
    public int minCost(int[] houses, int[][] cost, int m, int n, int target) {
        if(target > m || n<2 || m<1) return -1;
        if(calBlock(houses)>target) return -1;
        int result = 0;
        int block = 0;

        for (int i = 0; i < m; i++) {
            if(houses[i]!=0) continue;
            int min = Integer.MAX_VALUE;
            int color = 0;
            for (int j = 0; j < n; j++) {
                if(cost[i][j]<min) {
                    min = cost[i][j];
                    color = j+1;
                }
            }

            for (int j = 0; j < n; j++) {
                cost[i][j]-=min;
            }

            houses[i] = color;
            result+=min;
        }

        if (calBlock(houses)>target){

        }
        if (calBlock(houses)<target){

        }
        return  result;
    }

    public int minCost2(int[] houses, int[][] cost, int m, int n, int target) {
        if(target > m || n<2 || m<1) return -1;
        if(calBlock(houses)>target) return -1;
        int result = 0;
        int block = 0;

        int[] minChange = new int[m];
        int[] minChangeColor = new int[m];
        int[] minBefore = new int[m];
        int[] minAfter = new int[m];
        for (int i = 0; i < m; i++) {
            minAfter[i] = Integer.MAX_VALUE;
            minBefore[i] = Integer.MAX_VALUE;
            minChange[i] = Integer.MAX_VALUE;
        }

        for (int i = 0; i < m; i++) {
            int before = i==0?-1:houses[i-1];
            int after = i==m-1?-1:houses[i+1];
            for (int j = 0; j < n; j++) {
                if(j == before-1){
                    minBefore[i] = cost[i][j];
                    continue;
                }
                if(j == after-1){
                    minAfter[i] = cost[i][j];
                    continue;
                }
                if(cost[i][j]<minChange[i]) {
                    minChange[i] = cost[i][j];
                    minChangeColor[i] = j+1;
                }
            }
        }

        return result;
    }

    int calBlock(int[] houses){
        int block = 1;
        for (int i = 0;i<houses.length-1;i++){
            if(houses[i]!=houses[i+1]) block++;
        }
        return block;
    }
}

//AC
class BrowserHistory {

    LinkedList<String> history = new LinkedList<>();
    LinkedList<String> backed = new LinkedList<>();

    public BrowserHistory(String homepage) {
        history.addLast(homepage);
    }

    public void visit(String url) {
        backed = new LinkedList<>();
        history.addLast(url);
    }

    public String back(int steps) {
        while (steps >= 1 &&history.size()>1)
        {
            backed.addLast(history.removeLast());
            steps--;
        }
        return history.getLast();
    }

    public String forward(int steps) {
        while (steps >= 1 &&backed.size()>0) {
            history.addLast(backed.removeLast());
            steps--;
        }
        return history.getLast();
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */