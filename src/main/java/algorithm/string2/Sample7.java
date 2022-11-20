package algorithm.string2;

import java.util.Scanner;

public class Sample7 {

    public String solution(String str) {
        String answer ;
        char[] s = str.toCharArray();
        int lt = 0, rt= str.length()-1;

        while(lt < rt) {
            if(!Character.isAlphabetic(s[lt])) lt++;
            else if(!Character.isAlphabetic(s[rt])) rt--;
            else {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(s); //String형으로 형변환 시켜준다.
        return answer;
    }


    public static void main(String[] args) {
        Sample7 sample7 = new Sample7();
        Scanner kb = new Scanner(System.in);

        String str = kb.next();
        System.out.println(sample7.solution(str));
    }
}
