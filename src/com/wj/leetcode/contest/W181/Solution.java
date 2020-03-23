package com.wj.leetcode.contest.W181;

/**
 * Created by white_wolf on 2020/3/22.
 *
 * @author thebestwj
 */
public class Solution {

    //Q4 OT
    public String longestPrefix(String s) {
        if (s.length() <= 1) return "";
        for (int i = s.length() - 1; i >= 1; i--) {

            if (s.substring(0, i).equals(s.substring(s.length() - i, s.length()))) return s.substring(0, i);
        }
        return "";
    }


    //Q1 AC
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] result = new int[nums.length];
        for (int i : result) {
            i = -1;
        }
        for (int i = 0; i < nums.length; i++) {
            insert(result, nums[i], index[i]);
        }
        return result;
    }

    //Q1 Util
    public void insert(int[] target, int num, int index) {
        if (target[index] != -1) {
            for (int i = target.length - 1; i > index; i--) {
                target[i] = target[i - 1];
            }
        }
        target[index] = num;
    }

    //Q2 AC
    public int sumFourDivisors(int[] nums) {
        int result = 0;
        for (int i : nums) {
            result += cal(i);
        }
        return result;
    }

    //Q2 Util
    public int cal(int num) {
        if (num <= 5) return 0;
        int result = 1 + num;
        int count = 0;
        for (int i = 2; i * 2 <= num; i++) {
            if (num % i == 0) {
                count++;
                result += i;
            }
            if (count == 3) return 0;
        }
        return (count == 2) ? result : 0;
    }

    //Q3
    public boolean hasValidPath(int[][] grid) {
        int STOP = 0;
        int UP = 1;
        int RIGHT =2;
        int DOWN =3;
        int LEFT =4;
        int lastMove = 0;
        int m = grid.length;
        int n = grid[0].length;
        int x =0;
        int y =0;
        switch (grid[0][0]){
            case 1:
                lastMove=RIGHT;
                break;
            case 2:
                lastMove = DOWN;
                break;
            case 3:
                lastMove = RIGHT;
                break;
            case 4:
                lastMove = RIGHT;
                break;
            case 5:
                return false;
            case 6:
                lastMove = DOWN;
                break;
            default:
                return false;
        }
        while (lastMove !=0){
            lastMove = go(grid,lastMove,x,y);
            switch (lastMove){
                case 1:
                    y = y-1;
                    break;
                case 2:
                    x = x+1;
                    break;
                case 3:
                    y=y+1;
                    break;
                case 4:
                    x=x-1;
                default:
                    break;
            }
            if(x==n && y ==m) return true;
        }
        return false;
    }

    public int go(int[][] grid,int lastMove,int x,int y){
        int STOP = 0;
        int UP = 1;
        int RIGHT =2;
        int DOWN =3;
        int LEFT =4;
        int m = grid.length;
        int n = grid[0].length;

        switch (grid[x][y]){
            case 1:
                //x-1,y
                //x+1,y
                if(lastMove == 2){
                    if(x+1>grid.length) return 0;
                    return 2;
                }

                if(lastMove == 1){
                    if(x-1<0) return 0;
                    return 1;
                }
                break;

            case 2:
                //x,y-1
                //x,y+1
                if(lastMove == 3){
                    if(y+1>grid[0].length) return 0;
                    return 3;
                }

                if(lastMove == 1){
                    if(y-1<0) return 0;
                    return 1;
                }

                break;

            case 3:
                //x-1,y 2
                //x,y+1 1

                if(lastMove == UP){
                    if(x-1<0) return STOP;
                    return 4 ;
                }

                if(lastMove == RIGHT){
                    if(y+1>n) return STOP;
                    return DOWN;
                }

                break;
            case 4:
                //UP x,y-1
                //left x+1,y
                if(lastMove == UP){
                    if(x+1>m) return STOP;
                    return RIGHT ;
                }

                if(lastMove == LEFT){
                    if(y+1>n) return STOP;
                    return DOWN;
                }

                break;
            case 5:
                //Right x-1,y
                //down x,y-1
                if(lastMove == RIGHT){
                    if(y-1<0) return STOP;
                    return UP ;
                }

                if(lastMove == DOWN){
                    if(x-1<0) return STOP;
                    return LEFT;
                }
                break;
            case 6:
                // down x,y-1
                //right x,y+1
                if(lastMove == DOWN){
                    if(y+1>n) return STOP;
                    return RIGHT ;
                }

                if(lastMove == LEFT){
                    if(x-1<0) return STOP;
                    return UP;
                }

                break;
            default:
            return  0;
        }
        return 0;
    }
}
