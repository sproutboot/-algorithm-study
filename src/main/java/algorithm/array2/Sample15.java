package algorithm.array2;

import java.util.Scanner;

public class Sample15 {

    public int solution(int n, int m, int[][] arr) {
        int answer = 0;

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                int cnt = 0;
                for(int k = 0; k < m; k++) {
                    int pi = 0, pj = 0;
                    for(int s = 0; s < n; s++) {
                        if(arr[k][s] == i) pi = s; //그 학생을 찾았을 때 s등이라고 넣어주는 것
                        if(arr[k][s] == j) pj = s; //j번 학생을 찾았을 때 s등이라고 넣어주는 것
                    }
                    if(pi < pj) cnt++;
                }
                if(cnt == m) {
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Sample15 sample15 = new Sample15();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int m = kb.nextInt();

        int[][] arr = new int[m][n];

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = kb.nextInt();
            }
        }

        System.out.println(sample15.solution(n,m,arr));
    }
}
