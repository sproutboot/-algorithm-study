package algorithm.string;

import java.util.ArrayList;
import java.util.Scanner;

public class Sample14 {

    public ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();

        for(String x : str) {
            char[] s = x.toCharArray(); //단어를 갖는 String이 캐릭터 배열을 갖게 된다. s는 문자 배열이다.

            int lt = 0;
            int rt = x.length()-1;

            while(lt < rt) {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s); //s라는 문자 배열을 String화 시켜서 tmp에 넣었다.
            answer.add(tmp);
        }
        return answer;
    }

    public static void main(String[] args) {
        Sample14 sample14 = new Sample14();

        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String[] str = new String[n];

        for(int i = 0; i < n; i++) {
            str[i] = kb.next();
        }

        for(String x : sample14.solution(n, str)) {
            System.out.println(x);
        }
    }
}
