package algorithm.dfsandbfs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Sample6 {

    static int n, m, answer = Integer.MAX_VALUE;

    public void DFS(int L, int sum, Integer[] arr) {
        if(sum > m) return;
        if(L >= answer) return;
        if(sum == m) {
            answer = Math.min(answer, L);
        }
        else {
            for(int i = 0; i < n; i++) {
                DFS(L+1, sum+arr[i], arr);
            }
        }
    }

    public static void main(String[] args) {
        Sample6 sample6 = new Sample6();
        Scanner kb = new Scanner(System.in);

        n = kb.nextInt();
        Integer[] arr = new Integer[n]; //객체형으로 넘겨주어야 한다.

        for(int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder()); //내림차순으로 해서 큰 금액을 먼저 찾도록한다.
        m = kb.nextInt(); //거슬러 줄 돈
        sample6.DFS(0, 0, arr);
        System.out.println(answer);
    }
}
