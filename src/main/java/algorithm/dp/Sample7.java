package algorithm.dp;

import java.util.Scanner;

public class Sample7 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt(); //20분이라는 주어진 시간
        int[] dy = new int[m+1];

        for(int i = 0; i < n; i++) {
            int ps = kb.nextInt(); //이 문제를 푸는데 얻는 점수
            int pt = kb.nextInt(); //이 문제를 푸는데 걸리는 시간
            for(int j = m; j >= pt; j--) {
                dy[j] = Math.max(dy[j], dy[j-pt] + ps);
            }
        }
        System.out.println(dy[m]);
    }
}
