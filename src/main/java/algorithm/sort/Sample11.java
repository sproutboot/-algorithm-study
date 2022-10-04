package algorithm.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Sample11 {

    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[] tmp = arr.clone(); //깊은 복사
        Arrays.sort(tmp); //tmp를 오름차순으로 정렬

        for(int i = 0; i < n; i++) {
            if(arr[i] != tmp[i]) answer.add(i+1);
        }
        return answer;
    }

    public static void main(String[] args) {
        Sample11 sample11 = new Sample11();

        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) arr[i] = kb.nextInt();

        for(int x : sample11.solution(n, arr)) System.out.print(x + " ");
    }
}
