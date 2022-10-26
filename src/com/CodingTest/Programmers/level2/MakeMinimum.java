package com.CodingTest.Programmers.level2;

import java.util.Arrays;
import java.util.Collections;

//최솟값 만들기
public class MakeMinimum {
    public static int solution(int[]A, int[]B) {
        //A = 오름차순 정렬
        Arrays.sort(A);

        //B = 내림차순 정렬
        Integer [] tempB = new Integer[B.length];
        for(int i =0; i <B.length; i++){
            tempB[i] = B[i];
        }
        Arrays.sort(tempB, Collections.reverseOrder());

        // 곱하기
        int answer = 0;
        for(int i = 0; i<A.length; i++){
            answer += (A[i]* tempB[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        int [] arr1 = new int[] {1,2,3,4};
        int [] arr2 = new int[] {1,2,3,4};

        System.out.println(solution(arr1,arr2));
    }

}
