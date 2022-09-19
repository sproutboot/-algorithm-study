package algorithm.array;

import java.util.Scanner;

public class Sample2 {

    public int solution(int n, int[] arr) {
        int answer  = 1; //첫번째 사람은 무조건 보인다.
        int max = arr[0]; //최대값을 계속 갱신해야 한다.

        for(int i = 0; i < n; i++) {
            if(arr[i] > max) {
                answer++;
                max = arr[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Sample2 sample2 = new Sample2();

        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        System.out.print(sample2.solution(n, arr));
    }
}
