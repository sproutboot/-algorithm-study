package algorithm.dp2;

import java.util.Scanner;

public class Sample2 {
    static int[] dy;

    public int solution(int n) {
        dy[1] = 1;
        dy[2] = 2;

        for(int i = 3; i <= n+1; i++) {
            dy[i] = dy[i-2] + dy[i-1];
        }
        return dy[n+1];
    }

    public static void main(String[] args) {
        Sample2 sample2 = new Sample2();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        dy = new int[n+2];

        System.out.println(sample2.solution(n));
    }
}
