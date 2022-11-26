package algorithm.twopointers;

import java.util.Scanner;

public class Sample5 {

    public int solution(int n, int k, int[] arr) {
        int answer = 0;
        int sum = 0;

        for(int i = 0; i < k; i++) sum+= arr[i]; //k는 3이니까 인덱스 2까지 돈다.
        answer = sum;

        for(int i = k; i < n; i++) {
            sum+= (arr[i] - arr[i-k]);
            answer = Math.max(answer, sum);
        }

        return answer;
    }

    public static void main(String[] args) {
        Sample5 sample5 = new Sample5();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        System.out.println(sample5.solution(n, k, arr));
    }
}
