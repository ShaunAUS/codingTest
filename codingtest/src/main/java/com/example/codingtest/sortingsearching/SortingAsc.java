package com.example.codingtest.sortingsearching;

import java.util.Scanner;


/**
 * 선택정렬 -이중for문
 * <p>
 * 오름차순 구하기
 */
public class SortingAsc {

    public int[] solution(int n, int[] arr) {


        for (int i = 0; i < n ; i++) {

            int idx = i;
            for (int j = i + 1; j < n; j++) {

                if (arr[j] < arr[idx]) { //다음항이 더작으면
                    idx = j;
                }

                int tmp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = tmp;

            }
        }

        return arr;
    }

    public static void main(String[] args) {

        SortingAsc t = new SortingAsc();
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
