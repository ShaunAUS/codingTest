package com.example.codingtest.array;

import java.util.Scanner;

/**
 * 2-2
 * 앞사람보다 키가 크면 카운팅 2-2 130 135 148 140 145 150 150 153  // 작거나 같으면 안보임 1.이중 for문은 너무 느림
 */
public class CountTaller {


    public int solution(int n, int[] arr) {

        int answer = 1;  //첫번쨰 학생은 무조건 보임
        int max = arr[0];

        for (int i = 1; i < n; i++) {

            if (arr[i] > max) {
                answer++;
                max = arr[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        CountTaller t = new CountTaller();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(t.solution(n, arr));
    }

}
