package com.CodingTest.Programmers.level2;

import java.util.Arrays;

public class MaxMinValue {
    public static void main(String[] args) {
        String str = "1 2 3 4";
        String [] arr = str.split(" ");
        int [] tempArr = new int[arr.length];

        for(int i = 0; i<arr.length; i++){
            int temp = Integer.parseInt(arr[i]);
            tempArr[i] = temp;
        }

        Arrays.sort(tempArr);

        int [] answerArr = new int[2];
        answerArr[0] = tempArr[0];
        answerArr[1] = tempArr[arr.length-1];

        String answer = answerArr[0] + " " + answerArr[1];
        System.out.println(answer);
    }
}