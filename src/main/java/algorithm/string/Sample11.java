package algorithm.string;

import java.util.Scanner;

public class Sample11 {

    public String solution(String str) {
        String answer = ""; //가장 긴 단어를 저장하겠다.

        int m = Integer.MIN_VALUE; //가장 작은 값으로 초기화 된다.

        String[] s = str.split(" ");

        for(String x : s) { //x에 하나하나 단어가 대응 된다. 배열, 자료구조는 forEach 할 수 있다.
            int len = x.length();
            if(len > m) {
                m = len; //최대값이 m으로 갱신된다.
                answer = x; //기존 길이보다 더 긴 단어가 발견되는 것이다.
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Sample11 sample = new Sample11();

        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine(); //한 줄을 입력 받아야한다.
        System.out.print(sample.solution(str));
    }
}
