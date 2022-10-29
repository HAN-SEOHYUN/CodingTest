package com.CodingTest.Programmers.level3;
//DFS 네트워크
class Network {
    boolean [] visited;
    int size;
    int [][] data;
    int answer = 0;
    public int solution(int n, int[][] computers) {
        visited = new boolean[n];
        size=n;
        data = computers;

        for(int j = 0; j<size ; j++){
            if(!visited[j]){
                dfs(j);
                answer++;
            }
        }

        return answer;
    }

    public void dfs(int i){
        visited[i] = true;
        for(int j=0; j<size; j++){
            if(i!=j && data[i][j] ==1 && !visited[j]){
                dfs(j);
            }
        }

    }
}