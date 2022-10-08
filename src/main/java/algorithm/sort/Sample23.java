package algorithm.sort;

import java.util.Arrays;
import java.util.Scanner;

public class Sample23 {

    public int count(int[] arr, int distance) {
        int cnt = 1;
        int ep = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] - ep >= distance) {
                cnt++;
                ep = arr[i];
            }
        }
        return cnt;
    }

    public int solution(int n, int c, int[] arr) {
        int answer = 0;

        Arrays.sort(arr);
        int lt = 1;
        int rt = arr[n-1];

        while(lt <= rt) {
            int mid = (lt + rt) / 2;
            if(count(arr, mid) >= c) {
                answer = mid;
                lt = mid + 1;
            }
            else rt = mid -1;
        }
        return answer;
    }

    public static void main(String[] args) {
        Sample23 sample23 = new Sample23();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int c = kb.nextInt(); //말의 개수
        int[] arr = new int[n]; //말의 좌표

        for(int i = 0; i < n; i++) arr[i] = kb.nextInt();

        System.out.println(sample23.solution(n,c,arr));
    }
}
