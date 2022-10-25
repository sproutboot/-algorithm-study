package algorithm.dfsandbfs;

import java.util.Scanner;

public class Sample21 {
    static int n, answer = 0;
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};

    public void DFS(int x, int y, int[][] board) { //여기서 만나는 섬들을 다 0으로 바꿔야 한다. x, y는 현재 위치
        for(int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx >= 0 && nx < n  && ny >= 0 && ny < n && board[nx][ny] == 1) {
                board[nx][ny] = 0;
                DFS(nx, ny, board);
            }
        }
    }

    public void solution(int[][] board) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(board[i][j] == 1) { //섬을 만난 것 이중 for문이 돌면서 1을 만날 때마다 answer에 1을 증가
                    answer++; //섬의 개수를 1 증가
                    board[i][j] = 0; //출발점을 0으로 바꿔놓고 DFS에 넘긴다.
                    DFS(i, j, board);

                }
            }
        }
    }

    public static void main(String[] args) {
        Sample21 sample21 = new Sample21();
        Scanner kb = new Scanner(System.in);

        n = kb.nextInt();
        int[][] arr = new int[n][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = kb.nextInt();
            }
        }

        sample21.solution(arr);
        System.out.println(answer);
    }
}
