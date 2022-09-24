package algorithm.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Sample17 {

    public ArrayList<Integer> solution(int n, int k, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < k-1; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int lt = 0; //sliding window 시작
        for(int rt = k-1; rt < n; rt++) {
            map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1); //key값이 없을까봐 getOrDefault를 해서 0을 리턴하고 +1을 해준 것
            answer.add(map.size());
            map.put(arr[lt], map.get(arr[lt])-1); //여기서는 당연히 키 값이 존재한다.
            if(map.get(arr[lt]) == 0) map.remove(arr[lt]);
            lt++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Sample17 sample17 = new Sample17();

        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt(); //N = 7 매출액 기록 나열
        int k = kb.nextInt(); //k = 연속된 구간 4일

        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        for(int x : sample17.solution(n, k, arr)) System.out.print(x + " ");

    }

}
