package algorithm.dfsandbfs;

import java.util.Scanner;

public class Sample4 {

    static int answer = Integer.MIN_VALUE, n, m;

    public void DFS(int L, int sum, int time, int[] ps, int[] pt) {
        if(time > m) return;
        if(L == n) {
            answer = Math.max(answer, sum);
        }
        else {
            DFS(L+1, sum + ps[L], time + pt[L], ps, pt);
            DFS(L+1, sum, time, ps, pt);
        }
    }

    public static void main(String[] args) {
        Sample4 sample4 = new Sample4();
        Scanner kb = new Scanner(System.in);

        n = kb.nextInt();
        m = kb.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for(int i = 0; i < n; i++) {
            a[i] = kb.nextInt();
            b[i] = kb.nextInt();
        }

        sample4.DFS(0, 0, 0, a, b);
        System.out.println(answer);
    }
}
