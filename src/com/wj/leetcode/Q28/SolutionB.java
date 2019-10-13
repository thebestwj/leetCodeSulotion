package com.wj.leetcode.Q28;

/**
 * Created by white_wolf on 2019/10/13.
 *
 * @author thebestwj
 */
public class SolutionB {
    public int strStr(String haystack, String needle) {
        if (needle == null || needle.isEmpty()) {
            return 0;
        }
        if (haystack == null || haystack.isEmpty() || haystack.length() < needle.length()) {
            return -1;
        }

        int lengthOfNeedle = needle.length();
        for (int indexOfPiece = 0;
             indexOfPiece < haystack.length() - lengthOfNeedle+1;
             indexOfPiece++) {
            String pieceString = haystack.substring(indexOfPiece, indexOfPiece+lengthOfNeedle);
            if (pieceString.hashCode() == needle.hashCode()) {
                return indexOfPiece;
            }
        }
        return -1;
    }
}
