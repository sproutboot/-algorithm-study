package algorithm.string;

import java.util.Scanner;

public class Sample10 {

    public String solution(String str) {
        String answer = "";

        for(char x : str.toCharArray()) {
            if(x >= 65 && x <=90) answer+= (char)(x+32);
            else if(x >= 97 && x <= 122) answer+= (char)(x-32);
        }
        return answer;
    }

    public static void main(String[] args) {
        Sample10 sample = new Sample10();

        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(sample.solution(str));
    }
}
