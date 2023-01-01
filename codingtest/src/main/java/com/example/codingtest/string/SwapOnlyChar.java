package com.example.codingtest.string;

import java.util.Scanner;

/**
 * 1-5
 * 특정 문자 뒤집기 (a#b!GE*T@S)
 * 1. 앞뒤로 하나씩 비교해 문자면 스왑
 */
public class SwapOnlyChar {


    public String solution(String str) {
        String answer = "";

        char[] chars = str.toCharArray();
        int lt = 0; // 첫번쨰 문자
        int rt = str.length() - 1; // 마지막 문자

        while (lt < rt) {

            //index lt가 알파벳이 아니면 lt 1증가
            if (!Character.isAlphabetic(chars[lt])) {
                lt++;
                //index rt가 알파벳이 아니면 rt -1
            } else if (!Character.isAlphabetic(chars[rt])) {
                rt--;
                //둘다 알파벳이면
            } else {
                char temp = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = temp;
                lt++;
                rt--;

            }
        }
        answer = String.valueOf(chars);

        return answer;
    }

    public static void main(String[] args) {

        SwapOnlyChar t = new SwapOnlyChar();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();

        System.out.println(t.solution(str));
    }

}
