package com.example.codingtest.sortingsearching;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 버블 정렬 - 오름차순 정렬 => 맨오른쪽 끝값을 정하고 반복횟수 하나씩 줄여가면서 계속 돌려줘야함
 * <p>
 * 13 23 11 7 8 15
 *
 */
public class BubbleSorting {


    public int[] solution(int n, int[] arr) {

        int ex = 0; //  숫자 대기 공간

        //반복횟수
        for (int i = 0; i < n - 1; i++) {

            //맨오른쪽 제일큰값이 걸릴때마다 하나씩 줄여서 반복돌린다. 돌때마다 가장 큰값은 맨오른쪽으로 가게 되있다.
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    ex = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = ex;
                }
            }
        }
        return arr;
    }


    public static void main(String[] args) {

        BubbleSorting t = new BubbleSorting();
        Scanner kb = new Scanner(System.in);

        int i = kb.nextInt();
        int[] arr = new int[i];

        for (int k = 0; k < arr.length; k++) {
            arr[k] = kb.nextInt();
        }
        System.out.println(Arrays.toString(t.solution(i, arr)));
    }

}
