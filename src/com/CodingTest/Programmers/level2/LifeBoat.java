package com.CodingTest.Programmers.level2;

import java.util.Arrays;

public class LifeBoat {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        int cnt = people.length;
        int index = 0;
        int answer = 0;

        for (int i = people.length - 1; i >= index; i--) {
            if (people[i] + people[index] <= limit) {
                index++;
                answer++;
            } else {
                answer++;
            }
        }
        return answer;
    }
}
