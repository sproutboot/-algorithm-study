package algorithm.string;

import java.util.Scanner;

public class Sample17 {

    public String solution(String str) { //str이 회문인지 아닌지 보기
        String answer = "YES";

        str = str.toUpperCase();
        int len = str.length();

        for(int i = 0; i < len/2; i++) {
            if(str.charAt(i) != str.charAt(len-i-1)) return "NO";
        }

        return answer;
    }

    public static void main(String[] args) {
        Sample17 sample = new Sample17();

        Scanner kb = new Scanner(System.in);
        String str = kb.next();

        System.out.print(sample.solution(str));
    }
}
