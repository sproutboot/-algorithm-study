package algorithm.array;

import java.util.Scanner;

public class Sample11 {

    public int solution(int n, int[][] arr) { //arr = 5*5
        int answer = Integer.MIN_VALUE; //행들, 열들, 대각선 합 중 가장 큰 값을 저장할 것이다.(최대값 구하기)
        int sum1, sum2; //행의 합, 열의 합

        for(int i = 0; i < n; i++) {
            sum1 = sum2 = 0; //초기화
            for(int j = 0; j < n; j++) {
                sum1+= arr[i][j]; //0행이 누적
                sum2+= arr[j][i]; //0열이 누적
            }
            answer = Math.max(answer, sum1); //sum1과 sum2중 큰 값이 answer로 들어가게 된다. answer 기존값 보다 크다면
            answer = Math.max(answer, sum2);
        }
        sum1 = sum2 = 0; //대각선의 합을 구하기 위해 초기화
        for(int i = 0; i < n; i++) {
            sum1 += arr[i][i];
            sum2 += arr[i][n-i-1];
        }

        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);


        return answer;
    }

    public static void main(String[] args) {
        Sample11 sample11 = new Sample11();

        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] arr = new int[n][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.print(sample11.solution(n, arr));
    }
}
