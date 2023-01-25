package com.example.codingtest.sortingsearching;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 장난꾸러기 찾기
 *
 *  n개의 숫자들이 주어지고 오름차순 정렬뒤 두개의 값 위치바꾸고 그 위치 Index 알아내기
 *
 * 오름차순 정렬 -> 깊은 복사후 -> index로 값 비교 // 정렬을 잘 사용하면 쉽게 풀리는 문제가 많다!
 *
 */
public class Pranksters {


    public ArrayList<Integer> solution(int n, int[] arr) {

        ArrayList<Integer> answer = new ArrayList<Integer>();

        //깊은 복사
        int[] clone = arr.clone();

        //오름차순
        Arrays.sort(clone);

        for(int k=0; k<n; k++){
            if(arr[k] != clone[k]){
                answer.add(k+1);
            }
        }

        return answer;
    }


    public static void main(String[] args) {

        Pranksters t = new Pranksters();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[] arr = new int[n];

        for (int k = 0; k < n; k++) {
            arr[k] = kb.nextInt();
        }

        System.out.println((t.solution(n, arr)));
    }

}
