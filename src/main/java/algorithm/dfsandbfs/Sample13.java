package algorithm.dfsandbfs;

import java.util.Scanner;

public class Sample13 {

    static int[] b, p, ch; //순열이기 때문에 ch 배열이 있어야 한다.
    static int n, f;
    boolean flag = false;
    int[][] dy = new int[35][35];

    public int combi(int n, int r) {
        if(dy[n][r] > 0) return dy[n][r];
        if(n == r || r == 0) return 1;
        else return dy[n][r] = combi(n-1, r-1) + combi(n-1, r);
    }

    public void DFS(int L, int sum) {
        if(flag) return;
        if(L == n) { //순열 하나 완성
            if(sum == f) {
                for(int x : p) System.out.print(x + " ");
                flag = true;
            }
        } else {
            for(int i = 1; i <= n; i++) {
                if(ch[i] == 0) {
                    ch[i] = 1; //i라는 숫자를 사용했다. 인덱스가 아니고 i값 자체가 데이터이다. 순열을 하는 숫자이다.
                    p[L] = i;
                    DFS(L+1, sum + (p[L] * b[L]));
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Sample13 sample13 = new Sample13();
        Scanner kb = new Scanner(System.in);

        n = kb.nextInt();
        f = kb.nextInt();

        b = new int[n];
        p = new int[n];
        ch = new int[n+1]; //숫자를 1부터 사용해야 한다.
        for(int i = 0; i < n; i++) {
            b[i] = sample13.combi(n-1, i);
        }
        sample13.DFS(0, 0);
    }

}
