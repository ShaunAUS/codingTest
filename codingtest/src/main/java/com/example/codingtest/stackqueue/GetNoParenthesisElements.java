package com.example.codingtest.stackqueue;

import java.util.Scanner;
import java.util.Stack;

/**
 * 소괄호 안의 문자들은 빼고 나머지들만 출력
 *
 * ex: (A(BC)D)EF(G)(H)AQ    ==> EFAQ
 *
 * 1. 닫는 괄호를 만나면 여는괄호를 만날때까지 pop() 해주자
 */
public class GetNoParenthesisElements {

    //(AB)D(C)F   == DF

    public String solution(String str) {
        String answer = "";

        Stack<Character> stack = new Stack<>();
        char[] chars = str.toCharArray();
        for (char x : chars) {
            if(x == ')'){
                while(stack.pop() != '(');  // ( 가 나올때가지 뺀다.   // pop() 최근 넣은거 반납
            }
            else stack.push(x);  // 닫는 괄호가 아니면 무조건 넣기
        }

        for(int k =0; k<stack.size(); k++){
            answer += stack.get(k);
        }



        return answer;
    }


    public static void main(String[] args) {

        GetNoParenthesisElements t = new GetNoParenthesisElements();
        Scanner kb = new Scanner(System.in);

        String str = kb.next();
        System.out.println(t.solution(str));
    }

}
