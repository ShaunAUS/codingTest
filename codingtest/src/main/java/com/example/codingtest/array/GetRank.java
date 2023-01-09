package com.example.codingtest.array;

import java.util.Scanner;

/**
 * 등수구하기
 * <p>
 * 1. n개만큼 점수가 주어진다. 등수 구하기 , 같으면 같은 등수
 * <p>
 * -> 이중 for문 사용!  하나의 값을 기준으로 자기보다 크면 cnt 1씩증가 시키기 -> 기준이 되는 값 처음에는 무조건 1등올 시작
 */
public class GetRank {


    public int[] solution(int n, int[] arr) {
        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            int cnt = 1;
            for (int j = 0; j < n; j++) {

                if (arr[j] > arr[i]) {
                    cnt++;
                }
                answer[i] =cnt;
            }
        }
        return answer;
    }


    public static void main(String[] args) {

        GetRank t = new GetRank();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        for (int x : t.solution(n, arr)) {
            System.out.println(x + " ");
        }
    }

}


