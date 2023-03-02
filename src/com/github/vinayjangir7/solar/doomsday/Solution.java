package com.github.vinayjangir7.solar.doomsday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static int[] solution(int area) {
        // Your code here
        List<Integer> result = new ArrayList<>();
        while (area > 0) {
            int biggestSquareSide = (int) Math.sqrt(area);
            int biggestSquareArea = biggestSquareSide * biggestSquareSide;
            area -= biggestSquareArea;
            result.add(biggestSquareArea);
        }
        int[] answer = new int[result.size()];
        for (int i = 0; i < answer.length; i++)
            answer[i] = result.get(i);
        return answer;
    }

    public static void main(String[] args) {
        // get the start time
        long start = System.nanoTime();

        // call the method
        Arrays.stream(solution(12)).forEach(System.out::println);

        // get the end time
        long end = System.nanoTime();

        // execution time
        long execution = end - start;
        System.out.println("Execution time: " + execution / 1000000.0 + " milliseconds");
    }
}
