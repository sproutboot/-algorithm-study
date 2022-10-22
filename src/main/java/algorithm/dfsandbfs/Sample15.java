package algorithm.dfsandbfs;

import java.util.Scanner;

public class Sample15 {

    static int[] combi;
    static int n, m;

    public void DFS(int L, int s) {
        if(L == m) { //조합이 완성
            for(int x : combi) System.out.print(x + " ");
            System.out.println();
        }
        else {
            for(int i = s; i <= n; i++) {
                combi[L] = i;
                DFS(L+1, i+1);
            }
        }
    }

    public static void main(String[] args) {
        Sample15 sample15 = new Sample15();
        Scanner kb = new Scanner(System.in);

        n = kb.nextInt();
        m = kb.nextInt(); //m개를 뽑는 것

        combi = new int[m];
        sample15.DFS(0, 1); //레벨, 스타트 번호
    }
}
