package algorithm.string;

import java.util.Scanner;

public class Sample18 {

    public String solution(String str) {
        String answer = "NO";

        String tmp = new StringBuilder(str).reverse().toString();

        if(str.equalsIgnoreCase(tmp)) answer = "YES";
        return answer;
    }

    public static void main(String[] args) {
        Sample18 sample18 = new Sample18();

        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(sample18.solution(str));
    }
}
