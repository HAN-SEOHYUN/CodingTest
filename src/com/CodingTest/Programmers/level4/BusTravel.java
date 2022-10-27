package com.CodingTest.Programmers.level4;

public class BusTravel {
    public static int[][] solution(int n, int[][] signs) {
        int[][] answer = new int[signs.length][signs[0].length];
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[0].length; j++) {
                answer[i][j] = func2(n, signs);
            }
        }
        return answer;
    }

    public static int func2(int n, int[][] signs) {
        int result = 0;
        for (int i = 0; i < signs.length; i++) {
            for (int j = 0; j < signs[i].length; j++) {
                if (n == j) {
                    result = 1;
                    return result;
                } else {
                    return func2(j, signs);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] temp = {{0, 1, 0}, {0, 0, 1}, {1, 0, 0}};
        int[][] arr = solution(3, temp);
        for (int i = 0; i < arr.length; i++) {//행
            for (int j = 0; j < arr[i].length; j++) {//열
                System.out.print(arr[i][j] + "\t");
            }//안쪽 for
            System.out.println();
        }//바깥 for

    }

}





