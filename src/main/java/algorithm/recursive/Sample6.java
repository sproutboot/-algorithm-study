package algorithm.recursive;

class Node {
    int data;
    Node lt, rt;

    public Node(int val) {
        data = val;
        lt = rt = null;
    }
}

public class Sample6 {

    Node root;

    public void DFS(Node root) { //루트 노드 = 100번지를 가리키고 있다.
        if(root == null) return; // 말단 노드
        else {
            DFS(root.lt); //왼쪽
            System.out.print(root.data + " ");
            DFS(root.rt); //오른쪽
        }

    }

    public static void main(String[] args) {
        Sample6 tree = new Sample6();

        tree.root = new Node(1); //1이라는 데이터를 넘겼다. 데이터를 넘기는 순간 생성자는 null이 된다.
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.DFS(tree.root);
    }
}
