package com.wj.leetcode.Q101_200.Q151;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by white_wolf on 2020/4/10.
 *
 * @author thebestwj
 */
public class SolutionB {
    public String reverseWords(String s) {
        // 除去开头和末尾的空白字符
        s = s.trim();
        // 正则匹配连续的空白字符作为分隔符分割
        List<String> wordList = Arrays.asList(s.split("\\s+"));
        Collections.reverse(wordList);
        return String.join(" ", wordList);
    }

}
