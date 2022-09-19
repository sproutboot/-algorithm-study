package algorithm.string;

import java.util.Scanner;

public class Sample4 {

    public int solution(String str) {
        String answer = "";

        for(char x : str.toCharArray()) {
            if(Character.isDigit(x)) answer += x;
        }

        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        Sample4 sample4 = new Sample4();

        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(sample4.solution(str));
    }
}
