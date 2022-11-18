package algorithm.dp2;

import java.util.Scanner;

public class Sample3 {
    static int[] dy;

    public int solution(int[] arr) {
        int answer = Integer.MIN_VALUE;
        dy[0] = 1;

        for(int i = 1; i < arr.length; i++) {
            int max = 0;
            for(int j = i-1; j >= 0; j--) {
                if(arr[i] > arr[j] && dy[j] > max) max = dy[j];
            }
            dy[i] = max + 1;
            answer = Math.max(answer, dy[i]);
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

        dy = new int[n];
        System.out.println(sample3.solution(arr));
    }
}
