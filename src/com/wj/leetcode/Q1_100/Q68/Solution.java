package com.wj.leetcode.Q1_100.Q68;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by white_wolf on 2020/6/8.
 *
 * @author thebestwj
 */
public class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> l = new ArrayList<>();
        List<List<String>> storage = new ArrayList<>();
        for (int i=0;i<words.length;i++){
            int count = 0;
            List<String> g = new ArrayList<>();
            while (count<maxWidth) {
                count+=words[i].length();
                g.add(words[i]);
                i++;
                if(i==words.length) {
                    break;
                }
            }
            if(count>maxWidth) {
                g.remove(g.size()-1);
                i--;
            }
            storage.add(g);
        }
        return l;
        //todo
    }
}
