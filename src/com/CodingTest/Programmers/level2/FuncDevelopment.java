package com.CodingTest.Programmers.level2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//기능개발
//https://girawhale.tistory.com/57
public class FuncDevelopment {
    public static int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> workDate = new LinkedList<>(); // 개발기간, 중간에 있는 데이터를 삭제할 거라서 Queue linkedList 사용
        ArrayList<Integer> release = new ArrayList<>(); // 배포 당 기능 개수

        //각 기능이 개발되기까지 남은 기간
        for(int i =0; i<progresses.length; i++){
            workDate.add((int)Math.ceil((double)(100-progresses[i])/speeds[i])); //절대적 개발 기간 lindedList에 저장
        }

        int front = workDate.poll(); //poll 수행 시 가장 먼저 들어간 데이터가 return 된다. = FIFO
        int count = 1;

        while(!workDate.isEmpty()){
            if(front < workDate.peek()){
                release.add(count);
                count =1 ;
                front = workDate.poll();
            }else{
                count++;
                workDate.poll();
            }
        }
        release.add(count);

        return release.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int [] arr1 = new int[] {93, 30, 55};
        int [] arr2 = new int[]{1, 30, 5};
        int[] answer = solution(arr1, arr2);

        for(int a : answer){
            System.out.println(a);
        }
    }

}
