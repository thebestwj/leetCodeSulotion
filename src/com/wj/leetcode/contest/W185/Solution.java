package com.wj.leetcode.contest.W185;

import java.util.*;

/**
 * Created by white_wolf on 2020/4/19.
 *
 * @author thebestwj
 */
public class Solution { //352 / 5001
    public String reformat(String s) {
        char[] num = new char[s.length()];
        char[] al = new char[s.length()];
        int n_c = 0;
        int a_c = 0;
        for (char i : s.toCharArray()) {
            if (i >= '0' && i <= '9') {
                num[n_c] = i;
                n_c++;
            } else {
                al[a_c] = i;
                a_c++;
            }
        }
        String ans = "";
        if (Math.abs(n_c - a_c) > 1) return "";
        int i = 0;
        if (a_c > n_c) {
            for (i = 0; i < n_c; i++) {
                ans = ans + al[i];
                ans = ans + num[i];
            }
            while (i < a_c) {
                ans = ans + al[i];
                i++;
            }

        } else {
            for (i = 0; i < a_c; i++) {
                ans = ans + num[i];
                ans = ans + al[i];
            }
            while (i < n_c) {
                ans = ans + num[i];
                i++;
            }

        }
        return ans;
    }

    public List<List<String>> displayTable(List<List<String>> orders) {

        Map<String,Map<Integer,Integer>> foods;
        SortedSet<Integer> tables = new TreeSet<>();
        foods = new TreeMap<>(String::compareTo);
        for(List<String> order:orders){
            String dishName =order.get(2);
            int tableNum = Integer.parseInt(order.get(1));
            tables.add(tableNum);
            if(foods.containsKey(dishName)){
                Map<Integer,Integer> tableMap = foods.get(dishName);
                if(tableMap.containsKey(tableNum)){
                    int now = tableMap.get(tableNum);
                    tableMap.put(tableNum,now+1);
                }else{
                    tableMap.put(tableNum,1);
                }
            }else{
                Map<Integer,Integer> tableMap = new TreeMap<>();
                tableMap.put(tableNum,1);
                foods.put(dishName,tableMap);
            }
        }

        List<List<String>> result = new ArrayList<>();
        List<String> row  = new ArrayList<>();
        row.add("Table");
        for (String s:foods.keySet()){
            row.add(s);
        }
        result.add(row);

        for(Integer i:tables){
            List<String> row1  = new ArrayList<>();
            row1.add(String.valueOf(i));
            for (String s:foods.keySet()){
                if(foods.get(s).containsKey(i)){
                    row1.add(String.valueOf(foods.get(s).get(i)));
                }else{
                    row1.add("0");
                }
            }
            result.add(row1);
        }
        return result;
    }


    public int minNumberOfFrogs(String croakOfFrogs) {  //43
        int[] state = new int[5];
        for(char c:croakOfFrogs.toCharArray()){
            switch (c){
                case 'c':
                    if(state[4]>0){
                        state[4]--;
                    }
                    state[0]++;
                    break;
                case 'r':
                    if(state[0]>0){
                        state[1]++;
                        state[0]--;
                    }else return -1;
                    break;
                case 'o':
                    if(state[1]>0){
                        state[2]++;
                        state[1]--;
                    }else return -1;
                    break;
                case 'a':
                    if(state[2]>0){
                        state[3]++;
                        state[2]--;
                    }else return -1;
                    break;
                case 'k':
                    if(state[3]>0){
                        state[4]++;
                        state[3]--;
                    }else return -1;
                    break;
                default:
                    return -1;

            }
        }
        return state[0]+state[1]+state[2]+state[3] == 0?state[4]:-1;  // weikaolv state[0]+state[1]+state[2]+state[3]

    }


    public int numOfArrays(int n, int m, int k) {
        int MAGIC = 1000000007;
        if(k>m) return 0;
        long res = 0;
        int before=k-1;
        int after= n-k;
        for(int maxNum = Math.min(2,k); maxNum<=m;maxNum++) {
            int beforeNum = maxNum-1;
            int afterNum = m - maxNum+1;
            int betweenNum = maxNum - 1;
            for(int between = 0;between <= after;between ++){
                int tail = after - between;
                res = res + (before * (before-1) + between * betweenNum) * tail * afterNum ;
            }
            if(res>MAGIC) res-=MAGIC;
        }
        return (int) (res%MAGIC);
    }


}
