package com.example.codingtest.string;

import java.util.ArrayList;
import java.util.Scanner;


/**
 * 1-4
 * 1. 앞뒤 끝 문자 서로서로 바꾸기 하나씩 줄여가면서
 * 2.문자열 갯수, 문자열들 받고  문자열들 거꾸로 만들고 출력
 */
public class ReversedWords {


    public ArrayList<String> solution(int n, String[] str) {

        ArrayList<String> answer = new ArrayList<>();

        //1
        //앞뒤 끝 문자 서로서로 바꾸기 하나씩 줄여가면서
        // index 0 에서 시작 하나씩증가 , index 마지막 하나씩 감소 하면서 서로서로 문자 바꿔주기

        for (String x : str) {
            int lt = 0;
            int rt = x.length() - 1;

            char[] oneWord = x.toCharArray();
            while (lt<rt) {

                char tmp = oneWord[lt];
                oneWord[lt] = oneWord[rt];
                oneWord[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(oneWord);
            answer.add(tmp);
        }

        //2
        //문자 배열에서 전체 단어 뒤집기
       /* for (String x : str) {
            //단어 뒤집기
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }*/
        return answer;
    }


    public static void main(String[] args) {

        ReversedWords t = new ReversedWords();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt(); // 몇개 문자열 받을 건지
        String[] str = new String[n]; // 문자 담을 배열

        //문자 담기
        for (int i = 0; i < n; i++) {
            str[i] = kb.next();
        }

        for (String x : t.solution(n, str)) {
            System.out.println(x);
        }
    }

}
