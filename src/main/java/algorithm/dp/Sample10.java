package algorithm.dp;

import java.util.Scanner;

public class Sample10 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt(); //물품의 개수
        int k = kb.nextInt(); //버틸 수 있는 무게

        int[] dy = new int[k+1];

        for(int i = 0; i < n; i++) {
            int w = kb.nextInt();
            int v = kb.nextInt();
            for(int j = k; j >= w; j--) {
                dy[j] = Math.max(dy[j], dy[j - w] + v);
            }
        }
        System.out.println(dy[k]);
    }
}
