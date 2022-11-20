package algorithm.string2;

import java.util.ArrayList;
import java.util.Scanner;

public class Sample6 {

    public ArrayList<String> solution(int n, String[] arr) {
        ArrayList<String> answer = new ArrayList<>();

        for(String x : arr) {
            char[] s = x.toCharArray();
            int lt = 0; //직접 reverse()를 해주는 것이다. 손코딩 하라고 하면 이정도는 할 줄 알아야 한다.
            int rt = x.length()-1; //0번 인덱스부터 시작
            while(lt < rt) { //거짓이면 다 문자가 뒤집어져 있는 것이다.
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s); //s라는 문자배열을 String화 시켜준다. valueOf는 static 메서드
            answer.add(tmp);
        }

        return answer;
    }

    public static void main(String[] args) {
        Sample6 sample6 = new Sample6();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        String[] arr = new String[n];

        for(int i = 0; i < n; i++) {
            arr[i] = kb.next();
        }

        for(String x : sample6.solution(n, arr)) {
            System.out.println(x);
        }
    }
}
