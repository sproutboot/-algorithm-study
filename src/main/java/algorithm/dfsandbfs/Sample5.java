package algorithm.dfsandbfs;

import java.util.Scanner;

public class Sample5 {

    static int n, m;
    static int[] pm;

    public void DFS(int L) {
        if(L == m) {
            for(int x : pm) System.out.print(x + " ");
            System.out.println();
        }
        else {
            for(int i = 1; i <= n; i++) {
                pm[L] = i;
                DFS(L+1);
            }
        }
    }

    public static void main(String[] args) {
        Sample5 sample5 = new Sample5();
        Scanner kb = new Scanner(System.in);

        n = kb.nextInt();
        m = kb.nextInt();
        pm = new int[m];
        sample5.DFS(0);
    }
}
