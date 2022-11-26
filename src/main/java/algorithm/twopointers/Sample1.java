package algorithm.twopointers;

import java.util.ArrayList;
import java.util.Scanner;

public class Sample1 {

    public ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0; //두개의 포인터는 첫번째를 가리키고 있어야 한다.
        int p2 = 0;

        while(p1 < n && p2 < m) { //p1, p2 둘 중 누군가 하나가 거짓되면 전체가 거짓되는 것이다.
            if(a[p1] < b[p2]) answer.add(a[p1++]); //증감연산자에서 뒤쪽으로 가는 것
            else answer.add(b[p2++]);
        } //p1, p2 둘중 하나가 먼저 거짓이 된다.

        while(p1 < n) answer.add(a[p1++]);
        while(p2 < m) answer.add(b[p2++]);

        return answer;
    }

    public static void main(String[] args) {
        Sample1 sample1 = new Sample1();
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

        for(int x : sample1.solution(n, m, a, b)) {
            System.out.print(x + " ");
        }
    }
}
