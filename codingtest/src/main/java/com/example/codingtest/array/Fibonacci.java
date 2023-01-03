package com.example.codingtest.array;

import java.util.Scanner;

/**
 * 2-4
 * 피보나치 수열, 앞에 두항을 더해 다음항으로
 * <p>
 * n 7 이면  1 1 2 3 5 8 13
 */
public class Fibonacci {


    public int[] solution(int n) {
        int[] answer = new int[n];

        //방법 1 배열사용
        answer[0] = 1;
        answer[1] = 1;

        for (int i = 2; i < n; i++) {
            answer[i] = answer[i - 2] + answer[i - 1];
        }

        //방법 2 변수 3개 사용, 배열사용 x

        int a = 1;
        int b = 1;
        int c = 0;
        System.out.println(a + " " + b + " ");
        for (int x = 2; x < n; x++) {

            c = a + b;
            System.out.println(c + " ");
            //앞에 두항 바꾸기
            a = b;
            b = c;
        }

        return answer;
    }


    public static void main(String[] args) {

        Fibonacci t = new Fibonacci();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        for (int i : t.solution(n)) {
            System.out.println(i);
        }
    }

}
