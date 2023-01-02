package com.example.codingtest.string;

import java.util.Scanner;

/**
 *
 * 1-8
 * 문자와 숫자가 섞인 문자열에서 숫자만 골라서  출력
 *
 * char = 캐릭터는 원래 정수형 '0'= 48 ,  '9' = 57       //  48 < a < 57  = 숫자
 *
 * g0en2T0s8eSoft -> 208
 */
public class OnlyNumber {


    public int solution(String s) {

        //방법1
        int answer = 0;
        for (char x : s.toCharArray()) {
            if (x >= 48 && x <= 57) {
                answer = answer * 10 + (x - 48);  // x-48 에서 x는 아스키코드(숫자) 값이 들어감
            }
        }

        //방법2
  /*      String answer = "";
        for (char x : s.toCharArray()) {

            //isDigit() 숫자인지 물어보는 메서드
            if (Character.isDigit(x)) {
                answer += x;
            }
        }
        return Integer.parseInt(answer);*/
        //방법2 끝

        return answer;
    }


    public static void main(String[] args) {

        OnlyNumber t = new OnlyNumber();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();

        System.out.println(t.solution(str));
    }

}
