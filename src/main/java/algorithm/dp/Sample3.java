package algorithm.dp;

import java.util.Scanner;

public class Sample3 {
    static int[] dy;

    public int solution(int[] arr) {
        int answer = 0;
        dy = new int[arr.length];
        dy[0] = 1; //직관적인 값

        for(int i = 1; i < arr.length; i++) {
            int max = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] < arr[i] && dy[j] > max) max = dy[j]; {//j번째 항이 i번째 앞의 바로 항이 될 수 있다.
                }
                dy[i] = max+1;
                answer = Math.max(answer, dy[i]); //dy[i]값 중에 최대값이 answer에 저장된다.
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Sample3 sample3 = new Sample3();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        System.out.println(sample3.solution(arr));
    }
}
