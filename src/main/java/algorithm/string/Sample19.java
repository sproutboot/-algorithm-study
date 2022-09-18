package algorithm.string;

import java.util.Scanner;

public class Sample19 {

    public int solution(String s) {
        int answer = 0;

        for(char x : s.toCharArray()) {
            if(x >= 48 && x <= 57) answer = answer * 10 + (x - 48);
        }

        return (char)answer;
    }

    public static void main(String[] args) {
        Sample19 sample19 = new Sample19();

        Scanner kb = new Scanner(System.in);
        String str = kb.next(); //문자열 하나 받음
        System.out.print(sample19.solution(str));
    }
}
