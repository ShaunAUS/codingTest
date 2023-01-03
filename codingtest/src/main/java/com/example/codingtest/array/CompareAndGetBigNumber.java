package com.example.codingtest.array;

import java.util.ArrayList;
import java.util.Scanner;

/** 2-1
 * 앞에 숫자와 비교해 큰수만 출력
 */
public class CompareAndGetBigNumber {


    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList();

        answer.add(arr[0]);  //첫번쨰 값은 무조건 출력

        for (int i = 1; i < n; i++) {

            if (arr[i] > arr[i - 1]) {
                answer.add(arr[i]);
            }
        }
        return answer;
    }


    public static void main(String[] args) {

        CompareAndGetBigNumber t = new CompareAndGetBigNumber();
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
