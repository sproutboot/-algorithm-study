package algorithm.dfsandbfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point3 {
    int x, y;

    Point3(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Sample24 {
    static int n, answer = 0;
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
    Queue<Point3> Q = new LinkedList<>();

    public void BFS(int x, int y, int[][] board) {
        Q.offer(new Point3(x, y));

        while(!Q.isEmpty()) {
            Point3 pos = Q.poll();

            for(int i = 0; i < 8; i++) {
                int nx = pos.x + dx[i];
                int ny = pos.y + dy[i];
                if(nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 1) {
                    board[nx][ny] = 0;
                    Q.offer(new Point3(nx, ny));
                }
            }
        }
    }

    public void solution(int[][] board) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(board[i][j] == 1) {
                    answer++;
                    board[i][j] = 0; //출발점은 바다로 만들어버리고 BFS에다가 넘긴다.
                    BFS(i, j, board);
                }
            }
        }
    }

    public static void main(String[] args) {
        Sample24 sample24 = new Sample24();
        Scanner kb = new Scanner(System.in);

        n = kb.nextInt();
        int[][] arr = new int[n][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = kb.nextInt();
            }
        }

        sample24.solution(arr);
        System.out.println(answer);
    }
}
