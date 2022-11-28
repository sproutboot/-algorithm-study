package algorithm.twopointers;

import java.util.Scanner;

public class Sample12 {

    public int solution(int n) {
        int answer = 0, cnt = 1;
        n--;
        while(n > 0) {
            cnt++;
            n = n - cnt;
            if(n % cnt == 0) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Sample12 sample12 = new Sample12();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        System.out.println(sample12.solution(n));
    }
}
