package com.jeanponomarev.leetcode.medium.longest_string_without_repeation_characters;

import java.util.HashSet;
import java.util.Set;

public class Solution1 {

    // sliding window
    // https://www.youtube.com/watch?v=3IETreEybaA
    public int lengthOfLongestSubstring(String s) {
        int leftPointer = 0;
        int rightPointer = 0;
        int maxSubstringLength = 0;

        Set<Character> metChars = new HashSet<>();

        while (rightPointer < s.length()) {
            char currentChar = s.charAt(rightPointer);

            if (!metChars.contains(currentChar)) {
                metChars.add(currentChar);
                maxSubstringLength = Math.max(maxSubstringLength, metChars.size());
                rightPointer++;
            } else {
                char leftPointerChar = s.charAt(leftPointer);
                metChars.remove(leftPointerChar);
                leftPointer++;
            }
        }

        return maxSubstringLength;
    }
}
