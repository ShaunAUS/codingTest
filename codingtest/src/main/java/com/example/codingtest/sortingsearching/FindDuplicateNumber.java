package com.example.codingtest.sortingsearching;


import java.util.Arrays;
import java.util.Scanner;

/**
 * 중복된 값있으면 D  없으면 U출력
 *
 * - 오름차순 정렬뒤에 앞뒤같으면 중복
 */

public class FindDuplicateNumber {


    public String solution(int n, int[] arr) {

        String answer = "U";

        //방법 1
        /*for (int a = 0; a < n; a++) {
            for (int t = a + 1; t < n; t++) {

                if (arr[a] == arr[t]) {
                    return answer = "D";
                }
            }
        }*/


        //방법2
        Arrays.sort(arr);
        for(int k = 0; k < n-1 ; k++){
            if(arr[k] == arr[k+1]){
                return "D";
            }
        }

        return answer;
    }


    public static void main(String[] args) {

        FindDuplicateNumber t = new FindDuplicateNumber();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int k = 0; k < n; k++) {
            arr[k] = kb.nextInt();
        }

        System.out.println((t.solution(n, arr)));
    }

}
