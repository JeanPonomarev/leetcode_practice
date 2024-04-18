package com.jeanponomarev.leetcode.medium.longest_string_without_repeation_characters;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution1Test {

    private final Solution1 solution = new Solution1();

    @ParameterizedTest
    @MethodSource("parametersSource")
    void test(String input, int expectedResult) {
        int actualResult = solution.lengthOfLongestSubstring(input);
        System.out.println(actualResult);

        assertEquals(actualResult, expectedResult);
    }

    private static Stream<Arguments> parametersSource() {
        return Stream.of(
                Arguments.of("pwwkew", 3),
                Arguments.of("abcabcbb", 3),
                Arguments.of("bbbbb", 1),
                Arguments.of(" ", 1),
                Arguments.of("dvdf", 3)
        );
    }
}