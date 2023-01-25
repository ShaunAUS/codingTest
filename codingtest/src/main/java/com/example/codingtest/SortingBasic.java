package com.example.codingtest;

import java.util.Arrays;
import java.util.Scanner;

public class SortingBasic {


    public int[] solution(int n, int[] arr) {

        return null;
    }


    public static void main(String[] args) {

        SortingBasic t = new SortingBasic();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[] arr = new int[n];

        for (int k = 0; k < n; k++) {
            arr[k] = kb.nextInt();
        }

        System.out.println(Arrays.toString(t.solution(n, arr)));
    }

}
