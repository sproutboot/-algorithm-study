package algorithm.greedy;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

class Edge5 implements Comparable<Edge5> {
    public int vex; //정점
    public int cost; //정점으로 가는데 드는 비용

    Edge5(int vex, int cost) {
        this.vex = vex;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge5 edge5) {
        return this.cost - edge5.cost; //pQ할 때 작은 값이 우선순위로 해준다. 비용을 오름차순으로 정렬했기 때문에
    }
}

public class Sample9 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int m = kb.nextInt();
        ArrayList<ArrayList<Edge5>> graph = new ArrayList<ArrayList<Edge5>>(); //인접 리스트

        for(int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Edge5>());
        }

        int[] ch = new int[n+1];

        for(int i = 0; i < m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            int c = kb.nextInt();
            graph.get(a).add(new Edge5(b,c)); //a라는 정점에서 b라는 정점으로 가는데 비용이 c이다.
            graph.get(b).add(new Edge5(a,c)); //b라는 정점에서 a라는 정점으로 가는데 비용이 c이다. 무방향 그래프이기 때문에 이것도 추가해줘야 한다. 인접리스트가 완성된다.
        }

        int answer = 0; //최소비용을 넣을 값
        PriorityQueue<Edge5> pQ = new PriorityQueue<>();
        pQ.offer(new Edge5(1,0)); //1번 정점으로 가는데 비용이 0이다.

        while(!pQ.isEmpty()) { //비어있으면 멈춘다.
            Edge5 tmp = pQ.poll();
            int ev = tmp.vex; //도착하는 정점
            if(ch[ev] == 0) {
                ch[ev] = 1;
                answer += tmp.cost;

                for(Edge5 ob : graph.get(ev)) { //도착 정점에서 뻗어나가야 한다.
                    if(ch[ob.vex] == 0) pQ.offer(new Edge5(ob.vex, ob.cost));
                }
            }
        }

        System.out.println(answer);

    }
}
