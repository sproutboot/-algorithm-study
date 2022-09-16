package algorithm.string;

import java.util.ArrayList;
import java.util.Scanner;

public class Sample13 {

    public ArrayList<String> solution(int n, String[] str) { //String을 원소로 갖는 ArrayList
        ArrayList<String> answer = new ArrayList<>();

        for(String x : str) {
            String tmp = new StringBuilder(x).reverse().toString(); //toString을 통해 String으로 만들어 준다.
            answer.add(tmp);
        }

        return answer;
    }

    public static void main(String[] args) {
        Sample13 sample13 = new Sample13();

        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt(); //단어가 몇 개 들어오는지 읽음
        String[] str = new String[n]; //String 배열을 만든다. 단어 개수 하나하나 들어가야 한다.

        for(int i = 0; i < n; i++) {
            str[i] = kb.next(); //String 배열에다가 넣음
        }

        for(String x : sample13.solution(n, str)) {
            System.out.println(x);
        }
    }
}
