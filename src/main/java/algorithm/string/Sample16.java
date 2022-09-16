package algorithm.string;

import java.util.Scanner;

public class Sample16 {

    public String solution(String str) {
        String answer = "";

        for(int i = 0; i < str.length(); i++) {
            if(str.indexOf(str.charAt(i)) == i) answer+=str.charAt(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Sample16 sample16 = new Sample16();

        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(sample16.solution(str));
    }
}
