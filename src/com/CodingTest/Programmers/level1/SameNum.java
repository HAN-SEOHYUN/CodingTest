package com.CodingTest.Programmers.level1;

import java.util.ArrayList;
import java.util.LinkedList;

//같은 숫자는 싫어
public class SameNum {
    public static int[] solution(int []arr) {
       /* LinkedList<Integer> list = new LinkedList<>();
        for(int i=0; i<arr.length; i++){
            list.add(arr[i]);
        }

        for(int i=0; i<list.size(); i++){
            if(list.get(i) == list.get(i+1)){
                list.remove(i);
            }
        }

        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = (int)list.get(i);
        }*/
        ArrayList<Integer> answerList = new ArrayList<Integer>();
        int value = -1;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] != value) {
                answerList.add(arr[i]);
                value = arr[i];
            }
        }
        return answerList.stream().mapToInt(i->i).toArray();


    }

    public static void main(String[] args) {

        int [] arr = new int[]{4,4,4,3,3};
        int [] answer =  solution(arr);
        for(int temp : answer){
            System.out.println(temp);
        }

    }

}
