package com.CodingTest.Programmers.level2;

//올바른 괄호
public class Bracket {
    boolean solution(String s) {
        int bracket = 0;

        for(char c : s.toCharArray()){
            if(c == '(' ){
                bracket ++;
            }else if(c == ')' ){
                bracket --;
            }
            if(bracket < 0){return false;}
        }
        boolean answer = (bracket == 0 ? true : false);
        return answer;
    }
}
