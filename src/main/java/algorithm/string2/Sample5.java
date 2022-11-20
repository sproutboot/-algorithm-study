package algorithm.string2;

import java.util.Scanner;

public class Sample5 {

    public String solution(String str) {
        String answer = "";
        int max = Integer.MIN_VALUE, pos;

        while((pos=str.indexOf(' ')) != -1) {
            String tmp = str.substring(0, pos);
            int len = tmp.length();

            if(len > max) {
                max = len;
                answer= tmp;
            }
            str = str.substring(pos+1);
        }
        if(str.length() > max) answer= str; //마지막 단어 인덱스 꼭 처리해줘야 한다.
        return answer;
    }

    public static void main(String[] args) {
        Sample5 sample5 = new Sample5();
        Scanner kb = new Scanner(System.in);

        String str = kb.nextLine();
        System.out.println(sample5.solution(str));
    }
}
