package com.example.codingtest.array;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 소수뒤집기
 */
public class ReverseDecimal {


    private boolean isPrime(int res) {

        if (res == 1) {
            return false;
        }
        for (int a = 2; a < res; a++) {
            if (res % a == 0) {
                return false;
            }

        }
        return true;
    }


    public ArrayList<Integer> solution(int i, int[] arr) {

        ArrayList<Integer> answer = new ArrayList<>();
        for (int c = 0; c < i; c++) {

            int tmp = arr[c];
            int res = 0;  //tmp 를거꾸로 뒤집은 값

            //뒤짚은값 구하기
            while (tmp > 0) {

                int t = tmp % 10;   // tmp의 일의 자리 숫자 구하기
                res = res * 10 + t;
                tmp = tmp / 10;  // tmp 몫
            }
            if (isPrime(res)) {
                answer.add(res);

            }

        }

        return null;
    }


    public static void main(String[] args) {

        ReverseDecimal t = new ReverseDecimal();
        Scanner kb = new Scanner(System.in);

        int i = kb.nextInt();
        int[] arr = new int[i];

        for (int k = 0; k < i; k++) {
            arr[k] = kb.nextInt();
        }

        for (int x : t.solution(i, arr)) {

            System.out.println(x + " ");
        }

    }

}
