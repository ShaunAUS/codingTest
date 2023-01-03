package com.example.codingtest.array;

import java.util.Scanner;

/**
 * 2-5 소수 구하기
 * <p>
 * 30 -> 2 3 5 7 11 13 17 19 23 29 20 -> 2 3 5 7 11 13 17 19 10 -> 2 3 5 7
 * <p>
 * 1. arr[0] == 0 , arr[1] == 1, 은 제외  -> i 2부터 시작 2.i의 배수들은 i를 약수로 갖는다 고로 소수가 아님 -> ex) 2, 4 , 6,
 * 8.. 3. arr[i]  == 0 이면 이것도 소수 ,카운팅하고  arr[i배수] 는 제외하기
 */
public class Decimal {

    public int solution(int n) {
        int answer = 0;
        int[] ch = new int[n + 1];

        //0과 1은 제외
        for (int i = 2; i <= n; i++) {
            if (ch[i] == 0) {

                answer++; // index i 에 해당하는 값 카운팅 == 소수

                for (int j = i; j <= n; j = j + i) {
                    ch[j] = 1;  // i배수는 들은 제거
                }
            }


        }

        return answer;
    }


    public static void main(String[] args) {

        Decimal t = new Decimal();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        System.out.println(t.solution(n));
    }

}
