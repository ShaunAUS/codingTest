
package com.example.codingtest.stackqueue;

import static java.lang.Character.getNumericValue;

import java.util.Scanner;
import java.util.Stack;

/**
 * postfix (후위 연산식) ex: 352+*9-
 * <p>
 * 1. for 문돌리면서 숫자를 스택에다가 다 몰아넣고 연산자 만날떄  먼저꺼내는값 rt , 나중에 꺼낸값 lt로 계산진행
 */
public class Postfix {

    public int solution(String str) {

        Stack<Integer> stack = new Stack<>();

        char[] chars = str.toCharArray();
        for (char element : chars) {

            //숫자면
            if (Character.isDigit(element)) {
                stack.push(element - 48);   // '0' = 48 , '1' = 49 .....
            } else {
                int rt = stack.pop(); // 첫번째 꺼낸값
                int lt = stack.pop(); // 두번쨰 꺼낸값

                //연산자면
                if (element == '+') {
                    stack.push(lt + rt);
                } else if (element == '-') {
                    stack.push(lt - rt);
                } else if (element == '*') {
                    stack.push(lt * rt);
                } else if (element == '/') {
                    stack.push(lt / rt);
                }
            }
        }

        return stack.get(0);
    }


    public static void main(String[] args) {

        Postfix t = new Postfix();
        Scanner kb = new Scanner(System.in);

        String str = kb.next();
        System.out.println(t.solution(str));
    }

}
