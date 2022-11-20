package algorithm.string2;

import java.util.Scanner;

public class Sample4 {

    public String solution(String str) {
        String answer = "";
        int max = Integer.MIN_VALUE;
        String[] s = str.split(" ");

        for(String x : s) {
            int len = x.length();
            if(len > max) {
                max = len;
                answer = x;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Sample4 sample4 = new Sample4();
        Scanner kb = new Scanner(System.in);

        String str = kb.nextLine();
        System.out.println(sample4.solution(str));
    }
}
