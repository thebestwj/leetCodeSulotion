package com.wj.leetcode.Q126;

import java.util.*;

/**
 * Created by white_wolf on 2020/6/7.
 *
 * @author thebestwj
 */
//DFS TLE
public class Solution {

    List<List<String>> result = new ArrayList<>();

    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {

        long st = System.currentTimeMillis();
        if(wordList == null || !wordList.contains(endWord)) return result;
        Map<String,List<String>> connections = new HashMap<>();
        for (int i = 0; i < wordList.size(); i++) {
            List<String> att = new ArrayList<>();
            for (int j = 0; j < wordList.size(); j++) {
                if(linked(wordList.get(i),wordList.get(j))) att.add(wordList.get(j));
            }
            connections.put(wordList.get(i),att);
        }
        System.out.println(System.currentTimeMillis()-st);

        for (int i = 0; i < wordList.size(); i++) {
            if(linked(wordList.get(i),beginWord)){
                LinkedList<String> start = new LinkedList<>();
                start.add(beginWord);
                start.add(wordList.get(i));
                dfs(connections,start,endWord);
            }
        }
        return result;
    }

    void dfs(Map<String,List<String>> c, LinkedList<String> path,String end){

        //剪枝
        if(result.size()>0){
            if(path.size()>result.get(0).size()) return;
        }

        if(path.getLast().equals(end)){
            if(result.size()>0){
                if(path.size()<result.get(0).size()) result.clear();
            }
            result.add(new ArrayList<>(path));
            return;
        }

        List<String> choices = c.get(path.getLast());
        if(choices.size()==0) return;
        for (int i = 0; i < choices.size(); i++) {
            if(!path.contains(choices.get(i))) {
                path.addLast(choices.get(i));
                dfs(c,path,end);
                path.removeLast();
            }
        }
    }

    boolean linked(String a, String b){
        int dif = 0;
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i)!=b.charAt(i)) dif++;
        }
        return dif==1;
    }
}
