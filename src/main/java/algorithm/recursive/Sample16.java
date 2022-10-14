package algorithm.recursive;

import java.util.LinkedList;
import java.util.Queue;

class Node6 {
    int data;
    Node6 lt, rt;

    public Node6(int val) {
        data = val;
        lt = rt = null;
    }
}

public class Sample16 {
    Node6 root;

    public int BFS(Node6 root) {
        Queue<Node6> Q = new LinkedList<>();
        Q.offer(root);
        int L = 0;

        while(!Q.isEmpty()) {
            int len = Q.size();
            for(int i = 0; i < len; i++) {
                Node6 cur = Q.poll();
                if(cur.lt == null && cur.rt == null) return L;
                if(cur.lt != null) Q.offer(cur.lt);
                if(cur.rt != null) Q.offer(cur.rt);
            }
            L++;
        }
        return 0;
    }

    public static void main(String[] args) {
        Sample16 tree = new Sample16();

        tree.root = new Node6(1);
        tree.root.lt = new Node6(2);
        tree.root.rt = new Node6(3);
        tree.root.lt.lt = new Node6(4);
        tree.root.lt.rt = new Node6(5);

        System.out.println(tree.BFS(tree.root));
    }
}
