package algorithm.string2;

import java.util.Scanner;

public class Sample1 {

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
        Sample1 sample1 = new Sample1();
        Scanner kb = new Scanner(System.in);

        String str = kb.next();
        char c = kb.next().charAt(0); //0번 인덱스를 가져와라

        System.out.println(sample1.solution(str, c));
    }
}
