package src.main.java.com.example.codingtest.string;

import java.util.Scanner;

/**
 * 1-6
 * 중복문자 제거 후 문자열 그걸로 문자열 만들기  (ksekkset) -> (kset)
 */
public class RemoveDuplicatedChars {


    public String solution(String str) {
        String answer = "";

        for(int i =0 ; i<str.length() ; i++){
            //System.out.println(str.charAt(i)+ " " +i+" " + str.indexOf(str.charAt(i)));
            if((str.indexOf(str.charAt(i)))==i){
                answer += str.charAt(i);
            }
        }

        return answer;
    }


    public static void main(String[] args) {

        RemoveDuplicatedChars t = new RemoveDuplicatedChars();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();

        System.out.println(t.solution(str));
    }

}
