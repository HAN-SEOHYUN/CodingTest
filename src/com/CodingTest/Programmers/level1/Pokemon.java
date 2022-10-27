package com.CodingTest.Programmers.level1;

import java.util.HashSet;

//포켓몬
public class Pokemon {

    public int solution(int[] nums) {
        int answer = 0;
        int max = nums.length/2;
        HashSet set = new HashSet<Integer>();
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }

        if(set.size() > max){
            answer = max;
        }else{
            answer = set.size();
        }
        return answer;
    }


}
