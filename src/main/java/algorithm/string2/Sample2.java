package algorithm.string2;

import java.util.Scanner;

public class Sample2 {

    public String solution(String str) {
        String answer = ""; //answer에다가 대소문자 변환된 것 리턴

        for(char x : str.toCharArray()) { //String을 기반으로 문자배열이 하나 생성된다.
            if(Character.isLowerCase(x)) answer+= Character.toUpperCase(x);//x가 소문자냐 대문자냐 확인해야 한다.
            else answer+= Character.toLowerCase(x);
        }

        return answer;
    }

    public static void main(String[] args) {
        Sample2 sample2 = new Sample2();
        Scanner kb = new Scanner(System.in);

        String str = kb.next();
        System.out.println(sample2.solution(str));
    }
}
