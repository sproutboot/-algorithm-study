package algorithm.dfsandbfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point {
    public int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Sample18 {

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] board, dis;

    public void BFS(int x, int y) {
        Queue<Point> Q = new LinkedList<>();
        Q.offer(new Point(x, y)); //객체가 큐로 들어간다. 객체는 좌표이다.
        board[x][y] = 1;

        while(!Q.isEmpty()) { //큐가 비어있으면 멈춘다.
            Point tmp = Q.poll();
            for(int i = 0; i < 4; i++) {
                int nx = tmp.x + dx[i]; //tmp.x는 현재 좌표
                int ny = tmp.y + dy[i];
                if(nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && board[nx][ny] == 0) {
                    board[nx][ny] = 1;
                    Q.offer(new Point(nx, ny));
                    dis[nx][ny] = dis[tmp.x][tmp.y] + 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Sample18 sample18 = new Sample18();
        Scanner kb = new Scanner(System.in);

        board = new int[8][8];
        dis = new int[8][8];

        for(int i = 1; i <= 7; i++) {
            for(int j = 1; j <= 7; j++) {
                board[i][j] = kb.nextInt();
            }
        }

        sample18.BFS(1,1); //출발점을 넘겼다.

        if(dis[7][7] == 0) System.out.println(-1);
        else System.out.println(dis[7][7]);
    }
}
