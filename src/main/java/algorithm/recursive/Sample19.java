package algorithm.recursive;

import java.util.ArrayList;
import java.util.Scanner;

public class Sample19 {
    static int n, m, answer = 0;
    static ArrayList<ArrayList<Integer>> graph; //정점의 개수가 많으면 ArrayList로 한다.
    static int[] ch;

    public void DFS(int v) {
        if(v == n) answer++;
        else { //그렇지 않으면 뻗어라
            for(int nv : graph.get(v)) { //인접리스트에서 ArrayList 탐색할 때는 forEach가 좋다.
                if(ch[nv] == 0) {
                    ch[nv] = 1;
                    DFS(nv);
                    ch[nv] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Sample19 sample19 = new Sample19();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();

        for(int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }

        ch = new int[n+1];

        for(int i = 0; i < m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            graph.get(a).add(b);
        }
        ch[1] = 1;
        sample19.DFS(1);
        System.out.println(answer);
    }
}
