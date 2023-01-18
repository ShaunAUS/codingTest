
package com.example.codingtest.stackqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 자기보다 큰 숫자가 뒤에 있으면 맨뒤로 보내진다.   M번째 환자는 몇번쨰로 진료받는지 구하는 문제
 *  5 2
 * 60 50 70 80 90   ==> 3
 *
 * 객체로 순서와 값을 만들것
 */
class Person {

    int id;
    int priority;

    public Person(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }

}

public class Patient {

    public int solution(int n, int m, int[] arr) {
        int answer = 0;

        //환자 위험 순서 넣기
        Queue<Person> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            q.offer(new Person(i, arr[i]));  // 환자 입력된 순서와 위험도 같이 넣기
        }

        while (!q.isEmpty()) {
            Person tmp = q.poll();  // 맨 앞에 값
            for (Person x : q) {
                if (x.priority > tmp.priority) {  // 첫째값보다 다음값이 더크면
                    q.offer(tmp);  // 다시 맨뒤로 보낸다
                    tmp = null; //맨 앞에값 초기화
                    break;
                }
            }
            if (tmp != null) {
                answer++;
                if (tmp.id == m) {
                    return answer;
                }

            }
        }

        return answer;
    }


    public static void main(String[] args) {

        Patient t = new Patient();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int m = kb.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(t.solution(n, m, arr));
    }

}
