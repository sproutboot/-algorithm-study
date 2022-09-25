package algorithm.stack;

import java.util.Scanner;
import java.util.Stack;

public class Sample1 {

    public String solution(String str) {
        String answer = "YES";
        Stack<Character> stack = new Stack<>();

        for(char x : str.toCharArray()) {
            if(x == '(') stack.push(x);
            else {
                if(stack.isEmpty()) return "NO";
                stack.pop();
            }
        }
        if(!stack.isEmpty()) return "NO";
        return answer;
    }

    public static void main(String[] args) {
        Sample1 sample1 = new Sample1();

        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(sample1.solution(str));
    }
}
