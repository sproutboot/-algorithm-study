package algorithm.string;

import java.util.Scanner;

public class Sample21 {

    public int[] solution(String str, char c) {
        int[] answer = new int[str.length()];

        int p = 1000;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == c) {
                p = 0;
                answer[i] = p;
            }
            else {
                p++;
                answer[i] = p;
            }
        }

        p = 1000;
        for(int i = str.length()-1; i >= 0; i--) {
            if(str.charAt(i) == c) p = 0;
            else {
                p++;
                answer[i] = Math.min(answer[i],p); //기존값과 p중에서 작은 값 넣기
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Sample21 sample21 = new Sample21();

        Scanner kb = new Scanner(System.in);

        String s = kb.next(); //문자열 읽고
        char t = kb.next().charAt(0); //문자 하나 읽음

        for(int x : sample21.solution(s,t)) {
            System.out.print(x + " ");
        }
    }
}
