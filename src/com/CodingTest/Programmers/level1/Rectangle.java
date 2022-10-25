package com.CodingTest.Programmers.level1;

//직사각형 좌표 구하기
public class Rectangle {
    public static int[] solution(int[][] v) {
        int[] answer = new int[2];//직사각형을 만들기 위해 남은 점의 x,y 좌표

        //좌표 값이 같은 것을 제외하고 혼자 남는 좌표값 구하기
        for(int i=0; i < answer.length; i++){
            if(v[0][i] == v[1][i]){
                answer[i] = v[2][i];
            }else if(v[0][i] == v[2][i]){
                answer[i] = v[1][i];
            }else{
                answer[i] = v[0][i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[][] v= {{1,4},{3,4},{3,10}};
        int[] arr = solution(v);
        for (int a : arr) {
            System.out.print(a+" ");
        }
    }
}
