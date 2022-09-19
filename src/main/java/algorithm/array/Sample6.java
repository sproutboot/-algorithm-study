package algorithm.array;

import java.util.Scanner;

public class Sample6 {

    public int solution(int n) {
        int answer = 0;

        int[] check = new int[n+1];

        for(int i = 0; i <= n; i++) {
            if(check[i] == 0) {
                answer++;
                for(int j = i; j <= n; j=j+i)
                    check[j] = 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Sample6 sample6 = new Sample6();

        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(sample6.solution(n));
    }
}
