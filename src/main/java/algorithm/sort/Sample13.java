package algorithm.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Graph implements Comparable<Graph> {
    public int x, y;

    Graph(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Graph graph) { //정렬 기준을 만드는 것 오름차순과 내림차순
        if(this.x == graph.x) return this.y - graph.y;
        else return this.x - graph.x;
    }
}

public class Sample13 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList<Graph> list = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            int x = kb.nextInt();
            int y = kb.nextInt();
            list.add(new Graph(x, y));
        }

        Collections.sort(list);
        for(Graph o : list) System.out.println(o.x + " " + o.y);
    }

}
