package algorithm.dp;

import java.util.Arrays;
import java.util.Scanner;

public class Sample6 {
    static int n, m;
    static int[] dy;

    public int solution(int[] coin) {
        Arrays.fill(dy, Integer.MAX_VALUE); //dy배열을 큰 숫자로 초기화
        dy[0] = 0;

        for(int i = 0; i < n; i++) { //먼저 동전 1원이 적용된다.
            for(int j = coin[i]; j <= m; j++) { //거슬러줄 금액까지 쭉 증가해야 한다. 기존 값보다 작으면 바꿔줘야 한다.
                dy[j] = Math.min(dy[j], dy[j - coin[i]] + 1);
            }
        }
        return dy[m];
    }

    public static void main(String[] args) {
        Sample6 sample6 = new Sample6();
        Scanner kb = new Scanner(System.in);

        n = kb.nextInt(); //동전 종류의 개수 3
        int[] arr = new int[n]; //동전 단위가 들어있는 배열 1,2,5

        for(int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        m = kb.nextInt(); //거스름돈
        dy = new int[m+1]; //인덱스 번호가 m까지 생겨야 한다.
        System.out.println(sample6.solution(arr));

    }
}
