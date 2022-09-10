package algorithm;

import java.util.Scanner;

public class Sample2 {

    public String solution(String str) {
        String answer = "NO";

        String tmp = new StringBuilder(str).reverse().toString(); //이렇게 해주면 tmp가 뒤집어진 것 이다.

        if(str.equalsIgnoreCase(tmp)) answer += "YES"; //equals는 대소문자를 구분하면서 비교한다.
        return answer;
    }
    public static void main(String[] args) {
        Sample2 sample = new Sample2();

        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(sample.solution(str));
    }
}
