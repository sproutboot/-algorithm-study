package algorithm.twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Sample3 {

    public ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);
        int p1 = 0;
        int p2 = 0;

        while(p1 < n && p2 < m) { //누군가 하나가 거짓되면 전체가 거짓되서 멈춘다.
            if(a[p1] == b[p2]) {
                answer.add(a[p1++]);
                p2++;
            }
            else if(a[p1] < b[p2]) p1++; //작은 쪽을 증가
            else p2++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Sample3 sample3 = new Sample3();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n; i++) {
            a[i] = kb.nextInt();
        }

        int m = kb.nextInt();
        int[] b = new int[m];

        for(int i = 0; i < m; i++) {
            b[i] = kb.nextInt();
        }

        for(int x : sample3.solution(n, m, a, b)) {
            System.out.print(x + " ");
        }
    }
}
