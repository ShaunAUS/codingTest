package com.example.codingtest.array;

import java.util.Scanner;

/**
 * OX문제
 * <p>
 * 1.  = o 0. = x
 * 2. 1이면 1점 , 연속해서 맞추면 2점 , 틀리면 0점으로 다시
 * 3. n번만큼 해서 종합점수 구하기
 */
public class OXquiz {


    public int solution(int n, int[] arr) {


        int answer = 0;
        int cnt = 0; // 쌓이는 값

        //OX 결과
        for (int k = 0; k < n; k++) {

            // O인 경우
            if (arr[k] == 1) {
                cnt++;
                answer+=cnt;

                // X인경우
            } else if (arr[k] == 0) {
                cnt = 0;
            }

        }

        return answer;
    }


    public static void main(String[] args) {

        OXquiz t = new OXquiz();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt(); // 문제 수
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        System.out.println(t.solution(n,arr));
    }

}
