package algorithm.array;

import java.util.Scanner;

public class Sample12 {

    int[] dx = {-1, 0, 1, 0}; //행
    int[] dy = {0, 1, 0, -1}; //열

    public int solution(int n, int[][] arr) {
        int answer = 0;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) { //여기서 ij가 결정된 것
                //나는 봉우리인지 아닌지 판별해 줄 수 있는 변수를 하나 지정
                boolean flag = true;
                for(int k = 0; k < 4; k++) {
                    int nx = i + dx[k];//nx가 4방향을 보기위한 행 좌표
                    int ny = j + dy[k];//ny가 4방향을 보기위한 열 좌표
                    if(nx >= 0 && nx < n && ny >= 0 && ny < n && arr[nx][ny] >= arr[i][j]) { //열두시, 세시, 네방향의 값이 나 자신 내가 중심인 그 지점과 비교
                        flag = false;
                        break;
                    }
                }
                if(flag) answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Sample12 sample12 = new Sample12();

        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] arr = new int[n][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = kb.nextInt();
            }
        }

        System.out.print(sample12.solution(n, arr));
    }
}
