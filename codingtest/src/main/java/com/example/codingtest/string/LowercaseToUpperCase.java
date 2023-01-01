package com.example.codingtest.string;

import java.util.Scanner;

/** 1-2
 *  대문자는 소문자로 , 소문자는 대문자로 다시 입력해주기
 */
public class LowercaseToUpperCase {


    public String solution(String str) {
        String answer = "";

        for (char k : str.toCharArray()) {

            //소문자 -> 대문자
            if (Character.isLowerCase(k)) {
                answer+= Character.toUpperCase(k);
            }else{
                //대문자 -> 소문자
                 answer+= Character.toLowerCase(k);
            }
        }

        return answer;
    }


    public static void main(String[] args) {

        LowercaseToUpperCase t = new LowercaseToUpperCase();
        Scanner kb = new Scanner(System.in);
        String str = kb.next(); //문자열 받기

        System.out.println(t.solution(str));
    }

}
