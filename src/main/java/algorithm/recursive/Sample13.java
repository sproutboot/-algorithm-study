package algorithm.recursive;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Sample13 {

    int answer = 0;
    int[] dis = {1, -1, 5};
    int[] ch; //check 배열로 한번 방문한 곳은 다시 방문하지 않는다.
    Queue<Integer> Q = new LinkedList<>(); //Q를 전역으로 만듬

    public int BFS(int s, int e) {
        ch = new int[10001];
        ch[s] = 1; //출발지점
        Q.offer(s);
        int L = 0;

        while (!Q.isEmpty()) { //Q가 비어있을 때 멈춰야 한다.
            int len = Q.size(); //len이 원소의 개수이다.
            for (int i = 0; i < len; i++) {
                int x = Q.poll();
                for(int j = 0; j < 3; j++) {
                    int nx = x + dis[j];
                    if(nx == e) return L+1; //자식 노드 이므로 L+1을 해준다.
                    if(nx >= 1 && nx <= 10000 && ch[nx] == 0) {
                        ch[nx] = 1;
                        Q.offer(nx);
                    }
                }
            }
            L++;
        }
        return 0;
    }

    public static void main(String[] args) {
        Sample13 sample13 = new Sample13();

        Scanner kb = new Scanner(System.in);
        int s = kb.nextInt();
        int e = kb.nextInt();
        System.out.println(sample13.BFS(s,e));

    }
}
