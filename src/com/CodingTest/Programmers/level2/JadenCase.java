package com.CodingTest.Programmers.level2;

//첫 문자 대문자, 그 외의 알파벳 소문자
public class JadenCase {
    public static String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String answer = "";
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);

            if(i == 0|| s.charAt(i-1)==' ' ){
                sb.append(Character.toUpperCase(s.charAt(i)));
            }else{
                sb.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        answer = sb.toString();
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("abc abc"));
    }

}
