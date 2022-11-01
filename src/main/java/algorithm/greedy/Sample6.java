package algorithm.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

class Edge implements Comparable<Edge> {
    public int vex; //정점
    public int cost; //가중치

    Edge(int vex, int cost) {
        this.vex = vex;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge edge) {
        return this.cost - edge.cost;
    }
}

public class Sample6 {
    static int n, m;
    static ArrayList<ArrayList<Edge>> graph;
    static int[] dis;

    public void solution(int v) { //v = 1
        PriorityQueue<Edge> pQ = new PriorityQueue<>();
        pQ.offer(new Edge(v, 0));
        dis[v] = 0;
        while(!pQ.isEmpty()) {
            Edge tmp = pQ.poll();
            int now = tmp.vex;
            int nowCost = tmp.cost;
            if(nowCost > dis[now]) continue;
            for(Edge ob : graph.get(now)) {
                if(dis[ob.vex] > nowCost + ob.cost) {
                    dis[ob.vex] = nowCost + ob.cost;
                    pQ.offer(new Edge(ob.vex, nowCost + ob.cost));
                }
            }
        }
    }

    public static void main(String[] args) {
        Sample6 sample6 = new Sample6();
        Scanner kb = new Scanner(System.in);

        n = kb.nextInt();
        m = kb.nextInt();
        graph = new ArrayList<ArrayList<Edge>>();

        for(int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Edge>());
        }

        dis = new int[n+1];
        Arrays.fill(dis, Integer.MAX_VALUE);
        for(int i = 0; i < m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            int c = kb.nextInt();
            graph.get(a).add(new Edge(b,c));
        }

        sample6.solution(1);

        for(int i = 2; i <= n; i++) {
            if(dis[i] != Integer.MAX_VALUE) System.out.println(i + " : " + dis[i]);
            else System.out.println(i + " : impossible");
        }

    }
}
