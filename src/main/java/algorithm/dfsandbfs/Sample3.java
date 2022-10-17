package algorithm.dfsandbfs;

import java.util.Scanner;

public class Sample3 {

    static int answer = Integer.MIN_VALUE, n, c;

    public void DFS(int L, int sum, int[] arr) {
        if(c < sum) return;
        if(L == n) {
            answer = Math.max(answer, sum);
        }
        else {
            DFS(L+1, sum + arr[L], arr);
            DFS(L+1, sum, arr);
        }
    }

    public static void main(String[] args) {
        Sample3 sample3 = new Sample3();
        Scanner kb = new Scanner(System.in);

        n = kb.nextInt();
        c = kb.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        sample3.DFS(0, 0, arr);
        System.out.println(answer);
    }
}
