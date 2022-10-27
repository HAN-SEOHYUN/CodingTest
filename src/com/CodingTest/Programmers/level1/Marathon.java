package com.CodingTest.Programmers.level1;

//완주하지 못한 선수
import java.util.Arrays;

public class Marathon {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion); // 정렬

        int i = 0;
        for(i=0;i<completion.length;i++)
            if(!participant[i].equals(completion[i]))
                break;

        return participant[i];
    }
}
