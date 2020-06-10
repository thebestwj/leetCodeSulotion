package com.wj.leetcode.Q126;

import java.util.*;

/**
 * Created by white_wolf on 2020/6/7.
 *
 * @author thebestwj
 */
//BFS TLE //todo
public class SolutionB {
    List<List<String>> result = new ArrayList<>();

    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {

        if(wordList == null || !wordList.contains(endWord)) return result;
        Map<String,List<String>> connections = new HashMap<>();
        Set<String> visited = new HashSet<>();
        for (int i = 0; i < wordList.size(); i++) {
            List<String> att = new ArrayList<>();
            for (int j = 0; j < wordList.size(); j++) {
                if(linked(wordList.get(i),wordList.get(j))) att.add(wordList.get(j));
            }
            connections.put(wordList.get(i),att);
        }

        Queue<LinkedList<String>> q = new LinkedList<>();
        for (int i = 0; i < wordList.size(); i++) {
            if(linked(wordList.get(i),beginWord)){
                LinkedList<String> start = new LinkedList<>();
                start.add(beginWord);
                start.add(wordList.get(i));
                q.offer(start);
            }
        }


        while (q.size()>0){
            LinkedList<String> path = q.poll();
            if(result.size()>0){
                if(path.size()>result.get(0).size()) continue;
            }
            if(path.getLast().equals(endWord)){
                if(result.size()>0){
                    if(path.size()<result.get(0).size()) result.clear();
                }
                result.add(new ArrayList<>(path));
                continue;
            }
            List<String> choices = connections.get(path.getLast());
            if(choices.size()==0) {
                visited.add(path.getFirst());
                continue;
            }
            for (int i = 0; i < choices.size(); i++) {
                if(!path.contains(choices.get(i))||visited.contains(choices.get(i))) {
                    path.addLast(choices.get(i));
                    q.offer(new LinkedList<>(path));
                    path.removeLast();
                }
            }

        }
        return result;
    }


    boolean linked(String a, String b){
        int dif = 0;
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i)!=b.charAt(i)) dif++;
        }
        return dif==1;
    }
}
