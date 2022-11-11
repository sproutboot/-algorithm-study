package algorithm.dp;

import java.util.Scanner;

public class Sample1 {
    static int[] dy;

    public int solution(int n) { //n = 7
        dy[1] = 1; //직관적으로 알 수 있다.
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
        dy = new int[n+1]; //1번계단부터 시작할 것이기 때문에
        System.out.println(sample1.solution(n));
    }
}
