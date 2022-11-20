package algorithm.string2;

import java.util.Scanner;

public class Sample3 {

    public String solution(String str) {
        String answer = "";

        for(char x : str.toCharArray()) {
            if(x >= 97 && x <= 122) answer+= (char)(x-32);
            else answer+= (char)(x+32);
        }

        return answer;
    }

    public static void main(String[] args) {
        Sample3 sample3 = new Sample3();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();

        System.out.println(sample3.solution(str));
    }
}
