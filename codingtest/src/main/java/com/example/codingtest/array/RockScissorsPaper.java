package com.example.codingtest.array;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 2-3
 * 1,가위 2,바위 3,보     //     1 < 2 , 2 < 3,  1 > 3
 * <p>
 * 1. A기준 하나에서만 생각하자, A가이길경우 계산 , 나머지는 b가이기는 거니까
 */

public class RockScissorsPaper {


    public String solution(int n, int[] arr, int[] brr) {

        String answer = "";

        for (int i = 0; i < n; i++) {

            //A가 비길경우
            if (arr[i] == brr[i]) {
                answer += "D";

                //A가 이길경우
            } else if (arr[i] == 1 && brr[i] == 3) {
                answer += "A";
            } else if (arr[i] == 2 && brr[i] == 1) {
                answer += "A";
            } else if (arr[i] == 3 && brr[i] == 2) {
                answer += "A";

                //그 외의 경우는 B가 이기는 경우
            }else{
                answer += "B";
            }
        }

        return answer;
    }


    public static void main(String[] args) {

        RockScissorsPaper t = new RockScissorsPaper();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt(); // 몇번 가위바위보를 할지
        int[] arr = new int[n]; // A
        int[] brr = new int[n]; // B

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        for (int i = 0; i < n; i++) {
            brr[i] = kb.nextInt();
        }
        for(char x : t.solution(n,arr,brr).toCharArray()){
            System.out.println(x);
        }
    }

}
