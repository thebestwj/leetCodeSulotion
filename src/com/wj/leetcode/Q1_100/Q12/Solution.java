package com.wj.leetcode.Q1_100.Q12;

/**
 * Created by white_wolf on 2020/5/31.
 *
 * @author thebestwj
 */
//贪心算法
public class Solution {
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        while (num>=1000){
            sb.append("M");
            num-=1000;
        }
        while (num>=900){
            sb.append("CM");
            num-=900;
        }
        while (num>=500){
            sb.append("D");
            num-=500;
        }
        while (num>=400){
            sb.append("CD");
            num-=400;
        }
        while (num>=100){
            sb.append("C");
            num-=400;
        }
        while (num>=90){
            sb.append("XC");
            num-=90;
        }
        while (num>=50){
            sb.append("L");
            num-=50;
        }
        while (num>=40){
            sb.append("CL");
            num-=40;
        }
        while (num>=10){
            sb.append("X");
            num-=10;
        }
        while (num>=9){
            sb.append("IX");
            num-=9;
        }
        while (num>=5){
            sb.append("V");
            num-=5;
        }
        while (num>=4){
            sb.append("IV");
            num-=4;
        }
        while (num>=1){
            sb.append("I");
            num-=1;
        }
        return sb.toString();
    }

    //简化一下
    public String intToRoman2(int num) {
        // 把阿拉伯数字与罗马数字可能出现的所有情况和对应关系，放在两个数组中
        // 并且按照阿拉伯数字的大小降序排列，这是贪心选择思想
        int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder stringBuilder = new StringBuilder();
        int index = 0;
        while (index < 13) {
            // 特别注意：这里是等号
            while (num >= nums[index]) {
                // 注意：这里是等于号，表示尽量使用大的"面值"
                stringBuilder.append(romans[index]);
                num -= nums[index];
            }
            index++;
        }
        return stringBuilder.toString();
    }

}
