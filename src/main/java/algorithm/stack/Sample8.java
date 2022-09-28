package algorithm.stack;

import java.util.Scanner;
import java.util.Stack;

public class Sample8 {

    public int solution(String str) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for(char x : str.toCharArray()) { //문자배열이 하나 생성된다. 여기에서 str은 그대로 있는 것이고, 이 안에서 문자열 배열을 만들어 준 것
            if(Character.isDigit(x)) stack.push(x-48); //문자 5인 것 -> 숫자로 변환해줘야한다.
            else { //연산자를 만난 것
                int rt = stack.pop();
                int lt = stack.pop();
                if(x == '+') stack.push(lt+rt);
                else if(x == '-') stack.push(lt-rt);
                else if(x == '*') stack.push(lt*rt);
                else if(x == '/') stack.push(lt/rt);
            }
        }
        answer = stack.get(0);
        return answer;
    }

    public static void main(String[] args) {
        Sample8 sample8 = new Sample8();

        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(sample8.solution(str));
    }
}
