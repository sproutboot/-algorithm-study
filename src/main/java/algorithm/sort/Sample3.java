package algorithm.sort;

import java.util.Scanner;

public class Sample3 {

    public int[] solution(int n, int[] arr) {

        for(int i = 1; i < n; i++) {
            int tmp = arr[i], j;
            for(j = i-1; j >= 0; j--) {
                if(arr[j] > tmp) arr[j+1] = arr[j];
                else break;
            }
            arr[j+1] = tmp;
        }

        return arr;
    }

    public static void main(String[] args) {
        Sample3 sample3 = new Sample3();

        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        for(int x : sample3.solution(n, arr)) System.out.print(x + " ");
    }
}
