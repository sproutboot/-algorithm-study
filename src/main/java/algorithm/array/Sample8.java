package algorithm.array;

import java.util.ArrayList;
import java.util.Scanner;

public class Sample8 {

    public boolean isPrime(int num) { //num이 소수인지 확인하는 메서드 참 or 거짓 리턴
        if(num == 1) return false; //1은 소수가 아니다.
        for(int i =2; i < num; i++) {
            if(num % i == 0) return false;
        }
        return true;
    }

    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>(); //뒤집어서 소수면 ArrayList에 담아서 리턴하겠다.
        for(int i = 0; i < n; i++) { //각각의 숫자들을 하나하나 뒤집어서 탐색해야 한다.
            int tmp = arr[i];
            int res = 0;
            while(tmp > 0) {
                int t = tmp % 10;
                res = res * 10 + t;
                tmp = tmp / 10;
            }
            if(isPrime(res)) answer.add(res);
        }
        return answer;
    }

    public static void main(String[] args) {
        Sample8 sample8 = new Sample8();

        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        for(int x : sample8.solution(n,arr)) {
            System.out.print(x + " ");
        }
    }
}
