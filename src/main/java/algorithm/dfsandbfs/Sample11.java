package algorithm.dfsandbfs;

import java.util.Scanner;

public class Sample11 {
    int[][] dy = new int[35][35];

    public int DFS(int n, int r) {
        if(dy[n][r] > 0) return dy[n][r];
        if(n == r || r == 0) return 1;
        else return dy[n][r] = DFS(n-1, r-1) + DFS(n-1, r);
    }

    public static void main(String[] args) {
        Sample11 sample11 = new Sample11();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int r = kb.nextInt();

        System.out.println(sample11.DFS(n, r));
    }
}
