package algorithm;

import java.util.Scanner;

public class Sample9 {

    public String solution(String str) {
        String answer = "";

        for(char x : str.toCharArray()) {
            if(Character.isLowerCase(x)) answer+= Character.toUpperCase(x);
            else answer+= Character.toLowerCase(x);
        }

        return answer;
    }

    public static void main(String[] args) {
        Sample9 sample = new Sample9();

        Scanner kb = new Scanner(System.in);

        String str = kb.next();
        System.out.print(sample.solution(str));
    }
}
