
package com.example.codingtest.stackqueue;

import java.util.Scanner;
import java.util.Stack;

/**
 * 쇠 막대기문제
 */
public class IronStick {


    public int solution(String str) {

        int answer = 0;

        Stack<Character> stack = new Stack<>();
        char[] chars = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                stack.push('(');
            }
            //레이져이면   ()인 경우
            else {
                stack.pop();
                if (str.charAt(i - 1) == '(') {
                    answer += stack.size();   // stack.size() = 막대기 끝 = 막대기 개수
                }
                //  )) 인경우
                else {
                    answer++;
                }
            }

        }

        return answer;
    }


    public static void main(String[] args) {

        IronStick t = new IronStick();
        Scanner kb = new Scanner(System.in);

        String str = kb.next();
        System.out.println(t.solution(str));
    }

}
