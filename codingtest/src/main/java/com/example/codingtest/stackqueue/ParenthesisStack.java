
package com.example.codingtest.stackqueue;

import java.util.Scanner;
import java.util.Stack;

/**
 * 괄호 문제는  스택 사용해서 풀자  (옳바른 스택이면 YES 아니면 NO) 1. 닫는 괄호가 들어오면 스택안에 있는 여는 괄호 pop 시키기 2. 여는괄호 , 단는괄호 1:1
 * 로 맞아야함 3. 다 끝났을때 깔끔하게 비워져있어야함
 */
public class ParenthesisStack {


    public String solution(String str) {
        String answer = "YES";

        Stack<Character> stack = new Stack();

        char[] chars = str.toCharArray();

        for (char element : chars) {
            if (element == '(') {
                stack.push(element);

                //닫는 괄호 일경우 ')'
            } else {
                // 닫는괄호가 들어오는데 짝인 여는괄호가 없는 경우 (비어있는경우)
                if (stack.isEmpty()) {
                    return "NO";
                }
                stack.pop();
            }
        }
        //하나씩 돌았는데도 stack이 비어있지 않은 경우는 '(' 더많다는 소리
        if (!stack.isEmpty()) {
            return "NO";
        }
        return answer;
    }


    public static void main(String[] args) {

        ParenthesisStack t = new ParenthesisStack();
        Scanner kb = new Scanner(System.in);

        String str = kb.next();
        System.out.println(t.solution(str));
    }

}
