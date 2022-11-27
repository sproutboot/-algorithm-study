package algorithm.twopointers;

import java.util.Scanner;

public class Sample7 {

    public int solution(int n, int m, int[] arr) {
        int answer = 0, sum = 0, lt = 0;

        for(int rt = 0; rt < n; rt++) {
            sum+= arr[rt];
            if(sum == m) answer++; //rt값을 더했다면 lt~rt 까지의 합이 되는 것이다.
            while(sum >= m) {
                sum -= arr[lt++]; //그 값을 빼고 나서 lt가 증가
                if(sum == m) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Sample7 sample7 = new Sample7();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        System.out.println(sample7.solution(n, m, arr));
    }
}
