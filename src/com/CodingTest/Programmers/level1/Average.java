package com.CodingTest.Programmers.level1;

//평균구하기
public class Average {
    public static double solution(int[] arr) {
        double sum = 0;

        for(int i : arr){
            sum += i;
        }
        return sum/arr.length;
    }

    public static void main(String[] args) {
        int[]arr = new int[] {1,2};
        double answer = solution(arr);
        System.out.println(answer);
    }
}
