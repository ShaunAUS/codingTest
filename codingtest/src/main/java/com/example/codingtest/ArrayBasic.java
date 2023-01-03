package com.example.codingtest;

import com.example.codingtest.array.Decimal;
import java.util.Scanner;

public class ArrayBasic {



    public int[] solution(int n, int[] arr) {
        int[] answer = new int[n];

        return answer;
    }


    public static void main(String[] args) {

        ArrayBasic t = new ArrayBasic();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        for (int x : t.solution(n,arr)) {
            System.out.println(x + " ");
        }
    }

}
