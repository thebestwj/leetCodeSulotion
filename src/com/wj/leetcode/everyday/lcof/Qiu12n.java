package com.wj.leetcode.everyday.lcof;

/**
 * Created by white_wolf on 2020/6/2.
 *
 * @author thebestwj
 */
//求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）
public class Qiu12n {
    public int sumNums(int n) {
        boolean b = n > 0 && (n+=sumNums(n-1)) > 0;  //决定递归的出口
        return n ;
    }
}
