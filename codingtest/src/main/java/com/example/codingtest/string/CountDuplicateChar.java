package com.example.codingtest.string;

import java.util.Scanner;

/**
 * <문자열압축>
 * 대문자로 이루어진 문자열 입력받고 중복문자 바로 오른쪽에 중복갯수 숫자로 쓰고 출력 (반복횟수 한번은 x) AAABBC -> A3B2C
 */
public class CountDuplicateChar {


    public String solution(String str) {
        String answer = "";

        str = str + " "; // 빈문자열 넣어줘야 i i+1비교 할때 에레 언남
        int cnt = 1; // 0이 아닌 1로 초기화 // = 중복횟수

        //length()-1 해줘야 i가 빈문자열까지 안감
        for (int i = 0; i < str.length() - 1; i++) {

            //문자와 다음 문자가 중복이면
            if (str.charAt(i) == str.charAt(i + 1)) {
                cnt++;

                //문자가 다르면
            } else {
                answer += str.charAt(i); //문자 붙여주고
                if (cnt > 1) {
                    answer += String.valueOf(cnt); //중복 횟수 붙여주기 // 1은 그냥 무시
                    cnt = 1; //다시 중복횟수는 1로 초기화
                }
            }


        }
        return answer;
    }


    public static void main(String[] args) {

        CountDuplicateChar t = new CountDuplicateChar();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();

        System.out.println(t.solution(str));
    }

}
