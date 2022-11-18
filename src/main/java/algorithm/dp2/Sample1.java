package algorithm.dp2;

import java.util.Scanner;

public class Sample1 {
    static int[] dy;

    public int solution(int n) {
        dy[1] = 1;
        dy[2] = 2;

        for(int i = 3; i <= n; i++) {
            dy[i] = dy[i-2] + dy[i-1];
        }
        return dy[n];
    }

    public static void main(String[] args) {
        Sample1 sample1 = new Sample1();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        dy = new int[n+1];
        System.out.println(sample1.solution(n));
    }
}
