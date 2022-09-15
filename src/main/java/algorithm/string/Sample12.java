package algorithm.string;

import java.util.Scanner;

public class Sample12 {

    public String solution(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE;
        int pos;

        while((pos = str.indexOf(' ')) != -1) {
            String tmp = str.substring(0,pos);
            int len = tmp.length();
            if(len > m) { //클 때만 바꾸는 것으로 한다면 뒤 쪽 단어가 갱신되지 않는다.
                m = len;
                answer = tmp;
            }
            str = str.substring(pos + 1); //1을 더한 이유는 pos는 빈공백인데 빈 공백 다음으로 넘어가기 위해서이다.
        }
        if(str.length() > m) answer = str;
        return answer;
    }

    public static void main(String[] args) {
        Sample12 sample = new Sample12();

        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(sample.solution(str));
    }
}
