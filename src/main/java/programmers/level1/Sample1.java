package programmers.level1;

import java.util.Arrays;

public class Sample1 {

    public String solution(String my_string) {
        String answer = "";
        my_string = my_string.toLowerCase();
        char[] s = my_string.toCharArray();
        Arrays.sort(s);
        answer = String.valueOf(s);
        return answer;
    }
}
