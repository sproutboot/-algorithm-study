package algorithm.string;

import java.util.Scanner;

public class Sample15 {

    public String solution(String str) { //입력받은 문자열
        String answer = "";

        char[] c = str.toCharArray(); //String 기반으로 한 문자배열이 하나 만들어진다.

        int lt = 0;
        int rt = str.length()-1;

        while(lt < rt) {
            if(!Character.isAlphabetic(c[lt])) lt++;
            else if(!Character.isAlphabetic(c[rt])) rt--;
            else {
                char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer += String.valueOf(c);

        return answer;
    }

    public static void main(String[] args) {
        Sample15 sample15 = new Sample15();

        Scanner kb = new Scanner(System.in);
        String str = kb.next();

        System.out.print(sample15.solution(str));
    }
}
