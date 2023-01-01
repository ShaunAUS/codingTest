package src.main.java.com.example.codingtest.string;

import java.util.Scanner;

/** 1-3
 *  1.문장에서 길이가 가장 단어 찾기
 *  2.길이가 같으면 먼저 발견된거 출력
 */
public class FindLongestWordInSentence {

    public String solution(String str) {
        String answer = "";

        int m = Integer.MIN_VALUE;


        String[] s = str.split(" ");

        for (String k : s) {
            int len = k.length();
            if (len > m) {
                m = len;            // m = 최대길이값
                answer = k;
            }
        }

        return answer;
    }


    public static void main(String[] args) {

        FindLongestWordInSentence t = new FindLongestWordInSentence();
        Scanner kb = new Scanner(System.in);
        String line = kb.nextLine();// 한줄 입력받기

        System.out.println(t.solution(line));
    }

}
