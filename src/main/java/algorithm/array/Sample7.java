package algorithm.array;

import java.util.Scanner;

public class Sample7 {

    public int solution(int n) {
        int answer = 0;
        int[] check = new int[n+1];

        for(int i = 2; i <= n; i++) {
            if(check[i] == 0) answer++;
            for(int j = i; i <= n; j = j+i) check[i] = 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        Sample7 sample7 = new Sample7();

        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(sample7.solution(n));
    }
}
