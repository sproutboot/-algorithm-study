package algorithm.array2;

import java.util.Scanner;

public class Sample14 {

    public int solution(int n, int[][] arr) {
        int answer = 0, max = Integer.MIN_VALUE;

        for(int i = 1; i <= n; i++) {
            int cnt = 0; //i번 학생과 같은 반을 했던 j번 학생은 몇명 있는가
            for(int j = 1; j <= n; j++) {
                for(int k = 1; k <= 5; k++) {
                    if(arr[i][k] == arr[j][k]) {
                        cnt++;
                        break; //반드시 해줘야한다.
                    }
                }
            }
            if(cnt > max) {
                max = cnt;
                answer = i; //최대값을 만드는 i번 학생이 답이 된다.
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Sample14 sample14 = new Sample14();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[][] arr = new int[n+1][6];

        for(int i = 1; i <= n; i++) { //i는 학생 번호
            for(int j = 1; j <= 5; j++) { //j는 반
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.println(sample14.solution(n, arr));
    }
}
