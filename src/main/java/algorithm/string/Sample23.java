package algorithm.string;

import java.util.Scanner;

public class Sample23 {

    public String solution(String str) {
        String answer = "";
        str = str+" "; //빈 문자를 하나 플러스

        int cnt = 1;
        for(int i = 0; i < str.length()-1; i++) { //빈 문자를 하나 플러스 했기 때문에 빈 문자 전까지만 돌기
            if(str.charAt(i) == str.charAt(i+1)) cnt++;
            else {
                answer += str.charAt(i);
                if(cnt > 1) answer += String.valueOf(cnt); //cnt가 String 된다.
                cnt = 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Sample23 sample23 = new Sample23();

        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(sample23.solution(str));
    }
}
