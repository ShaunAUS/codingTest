package com.example.codingtest.string;

import java.util.Scanner;

/**
 * found7, time: study; Yduts; emit, 7Dnuof
 *
 * 1.앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고 합니다.
 * 문자열이 입력되면 해당 문자열이 팰린드롬이면 "YES", 아니면 “NO"를 출력하는 프로그램을 작성하세요.
 * 단 회문을 검사할 때 알파벳만 가지고 회문을 검사하며, 대소문자를 구분하지 않습니다.
 * 알파벳 이외의 문자들의 무시합니다.
 */
public class PalindromeOnlyChar {


    public String solution(String s) {
        String answer = "NO";

        // A-Z 가 아닌것들은 빈문자열("") 로 만들어라
        String d = s.toUpperCase().replaceAll("[^A-Z]","");
        String tmp = new StringBuilder(d).reverse().toString();
        if(tmp.equals(d))answer = "YES";
        return answer;
    }


    public static void main(String[] args) {

        PalindromeOnlyChar t = new PalindromeOnlyChar();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();  // 줄로 받을꺼니까

        System.out.println(t.solution(str));
    }

}
