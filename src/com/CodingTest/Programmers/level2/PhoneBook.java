package com.CodingTest.Programmers.level2;

import java.util.HashMap;
import java.util.Map;
//전화번호부
public class PhoneBook {
    public boolean solution(String[] phone_book) {
        Map<String,Integer> map = new HashMap<>();

        for(int i=0; i<phone_book.length; i++){
            map.put(phone_book[i],i);
        }

        for(int i=0; i<phone_book.length;i++){
            for(int j=0; j<phone_book[i].length();j++){
                if(map.containsKey(phone_book[i].substring(0,j)))
                    return false;
            }
        }
        return true;
    }

}