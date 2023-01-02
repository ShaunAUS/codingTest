package com.example.codingtest.string;

import java.util.Scanner;

/** 회문 문자열
 * 1-7 (전체길이 / 2) -1 까지만  맨앞,맨끝 비교하는 for문 돌면됌
 *
 * 1.대소문자 구분 없이 앞으로, 뒤로 읽어도 똑같은 문자열이면 yes 아니면 no(gooG)
 */
public class Palindrome {


    public String solution(String str) {
        String answer = "YES";
        int len = str.length();

        //방법 1
        //대문자로 싹다 변환
        str = str.toUpperCase();
/*
        for (int i = 0; i < len / 2; i++) {

            //첫문자  , 끝문자 같은지 비교
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                return "NO";
            }
        }*/

        //방법2
        String tmp = new StringBuilder(str).reverse().toString();
            if(!str.equals(tmp)){
                return "NO";
            }

        return answer;
    }


    public static void main(String[] args) {

        Palindrome t = new Palindrome();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();

        System.out.println(t.solution(str));
    }

}
