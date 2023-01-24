package com.example.codingtest.sortingsearching;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 삽입정렬 - tmp 값 정하고 그 값을 기준으로 오른쪽으로 밀기 6 11 7 5 6 10 9
 */
public class InsertSorting {


    public int[] solution(int n, int[] arr) {

        //1부터 시작
        for (int i = 1; i < n; i++) {

            int j;
            //비교값
            int tmp = arr[i];

            // i 이전값부터 시작
            // 비교값과 앞에 값들과 비교
            for (j = i - 1; j >= 0; j--) {

                //왼쪽이 더 크면 오른쪽으로 밀기
                if (arr[j] > tmp) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j + 1] = tmp;

        }

        return arr;
    }


    public static void main(String[] args) {

        InsertSorting t = new InsertSorting();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[] arr = new int[n];

        for (int a = 0; a < n; a++) {
            arr[a] = kb.nextInt();
        }

        System.out.println(Arrays.toString(t.solution(n, arr)));
    }

}
