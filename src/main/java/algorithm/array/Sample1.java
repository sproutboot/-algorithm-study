package algorithm.array;

import java.util.ArrayList;
import java.util.Scanner;

public class Sample1 {

    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);

        for(int i = 1; i < n; i++) {
            if(arr[i] > arr[i-1]) answer.add(arr[i]);
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

        for(int x : sample1.solution(n, arr)) {
            System.out.print(x + " ");
        }


    }
}
