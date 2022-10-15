package algorithm.recursive;

import java.util.Scanner;

public class Sample18 {

    static int n, m, answer = 0;
    static int[][] graph;
    static int[] ch;

    public void DFS(int v) { //출발점이 1
        if (v == n) answer++;
        else {
            for (int i = 1; i <= n; i++) { //i는 1번
                if (graph[v][i] == 1 && ch[i] == 0) {
                    ch[i] = 1;
                    DFS(i); //v에서 i로 이동하는 것이므로 이렇게 해줌
                    ch[i] = 0; //호출 위에서 했던것을 밑에서 해주면 취소가 되는 것
                }
            }
        }
    }
    public static void main(String[] args) {
        Sample18 sample18 = new Sample18();

        Scanner kb = new Scanner(System.in);
        n = kb.nextInt(); //정점의 개수
        m = kb.nextInt(); //간선의 개수
        graph = new int[n+1][n+1]; //정점번호를 의미한다. 행 인덱스번호, 열 인덱스번호
        ch = new int[n+1];

        for(int i = 0; i < m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            graph[a][b] = 1; //방향 그래프
        }
        ch[1] = 1; //출발해야하니 1번노드 체크를 건다.
        sample18.DFS(1);
        System.out.println(answer);
    }
}
