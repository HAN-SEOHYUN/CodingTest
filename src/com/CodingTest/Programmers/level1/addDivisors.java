package com.CodingTest.Programmers.level1;

import java.util.ArrayList;

//약수의 합 구하기
public class addDivisors {
    //약수 구하기
    public static ArrayList<Integer> findDivisor(int num) {
        ArrayList<Integer> divisorList = new ArrayList<>();

        for (int a = 1; a <= num; a++) {
            if ((num % a) == 0) {
                divisorList.add(a);
            }
        }
        System.out.println(divisorList);
        return divisorList;
    }

    //약수 더하기
    public static int findSum(ArrayList<Integer> list) {
        int sum=0;
        for(int num : list){
            sum+=num;
        }
        return sum;
    }

    public static void main(String[] args) {
        ArrayList<Integer> divisorList = findDivisor(10);
        int answer = findSum(divisorList);
        System.out.println(answer);
    }
}
