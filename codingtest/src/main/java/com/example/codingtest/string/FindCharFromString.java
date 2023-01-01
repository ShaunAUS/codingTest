package com.example.codingtest.string;

import java.util.Scanner;

/** 1-1
 *  문자열에 해당 문자가 몇개 인지 출력   ex: Computer  c
 *  1. 전부다 대문자로 바꾼다. (그래야 대소문자 구별 x)
 *  2. for문으로 찾기
 */
public class FindCharFromString {

    public int solution(String str, char t) {
        int answer = 0;

        String s = str.toUpperCase();
        char c = Character.toUpperCase(t);

        //방법1
        int i;
        for (i = 0; i < s.length();  i++){
            if(s.charAt(i) == c){
                answer++;
            }
        }

        //방법2
        /*for(char x : s.toCharArray()){
            if(x==c){
                answer++;
            }
        }*/

        System.out.println();

        return answer;
    }


    public static void main(String[] args) {

        FindCharFromString T = new FindCharFromString();
        Scanner kb = new Scanner(System.in);

        String str = kb.next();  //문자열 하나 읽기
        char c = kb.next().charAt(0);  //문자열로 읽고 charAt으로 문자 가져오기

        System.out.println(T.solution(str,c));
    }

}
