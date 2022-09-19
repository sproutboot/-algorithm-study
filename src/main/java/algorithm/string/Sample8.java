package algorithm.string;

import java.util.Scanner;

public class Sample8 {

    public int solution(String str, char c) {
        int answer = 0;

        str = str.toUpperCase();
        c = Character.toUpperCase(c);

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == c) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Sample8 sample = new Sample8();

        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);

        System.out.print(sample.solution(str,c));
    }
}
