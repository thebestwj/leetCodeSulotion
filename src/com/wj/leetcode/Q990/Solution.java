package com.wj.leetcode.Q990;

/**
 * Created by white_wolf on 2020/6/8.
 *
 * @author thebestwj
 */
public class Solution {
    public boolean equationsPossible(String[] equations) {
            // arr[0]表示a的值,arr[1]表示b的值...
            int[] arr = new int[26];
            int count = 1;
            for (String str : equations) { // 先遍历==号的,将有关系的连接起来
                char judge = str.charAt(1);
                if (judge == '=') {
                    int first = str.charAt(0) - 'a';
                    int end = str.charAt(3) - 'a';
                    if (arr[first] == 0 && arr[end] == 0) {
                        // 都没有出现过
                        arr[first] = arr[end] = count++;
                    } else if (arr[first] == 0 || arr[end] == 0) {
                        // 只有一个出现过,将他俩的值设置为一样,这里取大取小都行,无所谓
                        int max = Math.max(arr[first], arr[end]);
                        arr[first] = arr[end] = max;
                    } else {
                        // 都出现过,两个集合相交了,将所有等于他俩值的字母的权值设置成同一个,也是取哪个都无所谓
                        int value = arr[first];
                        int value2 = arr[end];
                        for (int i = 0; i < arr.length; i++) {
                            if (arr[i] == value || arr[i] == value2) {
                                arr[i] = value;
                            }
                        }
                    }
                }
            }
            // 再次遍历strs,找到所有!=,并判断是否成立
            for (String s : equations) {
                char judge = s.charAt(1);
                if (judge == '!') {
                    int first = s.charAt(0) - 'a';
                    int end = s.charAt(3) - 'a';
                    if (first == end) { // 同一个字母 a!=a 肯定错
                        return false;
                    }
                    if (arr[first] != 0 && arr[end] != 0) {
                        // 都出现过,看两者的值是否一样,一样就返回false
                        if (arr[first] == arr[end]) {
                            return false;
                        }
                    }
                }
            }
            return true;
    }
}
