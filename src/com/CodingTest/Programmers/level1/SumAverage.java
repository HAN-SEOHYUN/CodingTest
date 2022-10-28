package com.CodingTest.Programmers.level1;

//평균구하기
public class SumAverage {
    public double solution(int[] arr) {
        int result = 0;

        for(int num : arr){
            result += num;
        }

        return (double)result /arr.length;
    }
}
