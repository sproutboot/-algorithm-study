package algorithm.array;

import java.util.Scanner;

public class Sample4 {

    public int[] solution(int n) {
        int[] answer = new int[n];
        answer[0] = 1;
        answer[1] = 1;

        for(int i = 2; i < n; i++) {
            answer[i] = answer[i-2] + answer[i-1];
        }
        return answer;
    }

    public static void main(String[] args) {
        Sample4 sample4 = new Sample4();

        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        for(int x : sample4.solution(n)) {
            System.out.print(x + " "); //배열을 foreach로 출력
        }
    }
}
