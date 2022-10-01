package algorithm.sort;

import java.util.Scanner;

public class Sample1 {

    public int[] solution(int n, int[] arr) {
        int[] answer = new int[n];

        for(int i = 0; i < n-1; i++) {
            int index = i;
            for(int j = i+1; j < n; j++) {
                if(arr[j] < arr[index]) index = j;
            }
            int tmp = arr[i];
            arr[i] = arr[index];
            arr[index] = tmp;
        }

        return answer;
    }

    public static void main(String[] args) {
        Sample1 sample1 = new Sample1();

        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        for(int x : sample1.solution(n, arr)) System.out.print(x + " ");

    }
}
