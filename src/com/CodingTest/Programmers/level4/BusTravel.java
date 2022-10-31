package com.CodingTest.Programmers.level4;

//버스정류장
public class BusTravel {
    static int size;
    static int[][] answer;
    static int[][] data;
    static int[] bool;

    public static int[][] solution(int n, int[][] signs) {
        size = n;
        data = signs;
        answer = new int[n][n];

        for (int j = 0; j < size; j++) {
            bool = new int[size];
            answer[j] = dfs(j);
        }
        return answer;
    }

    public static int[] dfs(int i) {
        for (int j = 0; j < size; j++) {
            if(bool[j] ==1){
                continue;
            }

            if (i != j && data[i][j] == 1) {
                bool[j] = 1;
                dfs(j);
            }
        }
        return bool;
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





