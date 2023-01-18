
package com.example.codingtest.stackqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 강의 순서 문제
 * <p>
 * <p>
 * ex:  CBA 순서대로  진행되야함    -> CBEEPA yes  , CAEEPB  no
 *
 * CBA 에서 하나씩 줄어들때 앞에 아무것도 없어야함  그래야 순서대로 들은것
 */
public class Lecture {


    public String solution(String need, String plan) {

        String answer = "YES";

        //큐에 필수과목 세팅
        Queue<Character> q = new LinkedList<>();
        for (char needChar : need.toCharArray()) {
            q.offer(needChar);
        }
        for (char planChar : plan.toCharArray()) {
            if (q.contains(planChar)) {
                if (planChar != q.poll()) {  //  -> 바로위에꺼 꺼낸게 같지 않으면 순서대로 들은게 아님
                    return "NO";
                }
            }
        }

        if (!q.isEmpty()) {
            return "NO";
        }

        return answer;
    }


    public static void main(String[] args) {

        Lecture t = new Lecture();
        Scanner kb = new Scanner(System.in);

        String a = kb.next();
        String b = kb.next();
        System.out.println(t.solution(a, b));
    }

}
