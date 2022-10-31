package com.CodingTest.Programmers.level2;


//사용할 수 있는 숫자가 담긴 배열 numbers, 타겟 넘버 target이 매개변수로 주어질 때 숫자를 적절히 더하고 빼서 타겟 넘버를 만드는 방법의 수를 return 하도록 solution 함수를 작성해주세요.
//
//제한사항
//주어지는 숫자의 개수는 2개 이상 20개 이하입니다.
//각 숫자는 1 이상 50 이하인 자연수입니다.
//타겟 넘버는 1 이상 1000 이하인 자연수입니다.
public class TargetNumber {
    int answer;

    // 3. dfs(numbers, target, idx:몇 번째 인덱스인지, sum: idx까지 누적된 값).
    public void dfs(int[] numbers,int target,int idx,int sum){
        // 4. 모든 정수를 탐색했을 때,
        if(idx == numbers.length){
            // 5. 누적합이 target과 동일하면 answer++ 후 메소드 종료.
            if(sum == target) answer++;
            return;
        }

        // 6. 현재 인덱스의 정수를 +로 합해준다.
        sum+=numbers[idx];
        // 7. 다음 인덱스 dfs 수행.
        dfs(numbers,target,idx+1,sum);
        // 8. 6.의 값을 다시 빼준 뒤,
        sum-=numbers[idx];
        // 9. 현재 인덱스의 정수를 -로 합해준다.
        sum+=(-1 * numbers[idx]);
        // 10. 다시 다음 인덱스 dfs 수행.
        dfs(numbers,target,idx+1,sum);

    }

    public int solution(int[] numbers, int target) {
        // 1. answer은 전역변수로 선언.
        answer = 0;

        // 2. dfs수행.
        dfs(numbers,target,0,0);

        return answer;
    }



}
