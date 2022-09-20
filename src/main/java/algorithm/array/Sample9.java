package algorithm.array;

import java.util.Scanner;

public class Sample9 {

    public int solution(int n, int[] arr) {
        int answer = 0;

        int cnt = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] == 1) {
                cnt++;
                answer+= cnt;
            } else cnt = 0;
        }

        return answer;
    }

    public static void main(String[] args) {
        Sample9 sample9 = new Sample9();

        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        System.out.print(sample9.solution(n,arr));
    }
}
