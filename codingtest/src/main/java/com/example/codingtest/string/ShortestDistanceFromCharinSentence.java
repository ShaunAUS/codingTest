package com.example.codingtest.string;

import java.util.Scanner;

/**
 * 문자열에서 해당 문자로부터 제일 짧은 거리 숫자로 나열   (teachermode e)
 *
 * 1. 왼쪽에서 for문 돌아서 위치값 과 오른쪽에서 왼쪽으로 for문 돌면서 위치값 비교해서 작은값으로 출력
 */
public class ShortestDistanceFromCharinSentence {


    public int[] solution(String s, char t) {
        int[] answer = new int[s.length()];
        int p = 1000;

        //왼쪽에서 오른쪽으로 for문 돌면서 해당 '문자' 와의 거리 값
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t) {
                p = 0;
                answer[i] = p;
            } else {
                p++;
                answer[i] = p;
            }
        }

        //오른쪽에서 왼쪽으로 for문 돌면서 해당 '문자' 와의 거리값
        //여기서 위에 값들과 비교해 짧은값을 모아서 출력
        p = 1000;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == t) {
                p = 0;
            } else {
                p++;
                answer[i] = Math.min(answer[i], p); // 기존값과 둘중에 작은값(거리가 짧은값) 으로 출력
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        ShortestDistanceFromCharinSentence T = new ShortestDistanceFromCharinSentence();
        Scanner kb = new Scanner(System.in);
        String str = kb.next(); // 문자열
        char c = kb.next().charAt(0); // 문자

        for (int x : T.solution(str, c)) {
            System.out.print(x + " ");
        }
    }

}
