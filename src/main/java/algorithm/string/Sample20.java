package algorithm.string;

import java.util.Scanner;

public class Sample20 {

    public int solution(String str) {
        String answer = "";

        for(char x : str.toCharArray()) {
            if(Character.isDigit(x)) answer += x; //String으로 누적된다.
        }
        return Integer.parseInt(answer); //문자열을 정수형으로 변환
    }

    public static void main(String[] args) {
        Sample20 sample20 = new Sample20();

        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(sample20.solution(str));
    }
}
