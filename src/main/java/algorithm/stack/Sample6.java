package algorithm.stack;

import java.util.Scanner;
import java.util.Stack;

public class Sample6 {

    public int solution(int n, int[][] board, int k, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for(int pos : moves) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][pos-1] != 0) {
                    int tmp = board[i][pos-1]; //이 인형과 stack의 상단의 인형과 비교를 해야함
                    board[i][pos-1] = 0; //인형 가져왔으니까 빈칸으로 만들기
                    if (!stack.isEmpty() && tmp == stack.peek()) { //stack의 값만 확인하므로 꺼내지 않는 peek() 메서드를 사용한다.
                        answer += 2;
                        stack.pop(); //터뜨려지는 것이므로 상단에 있는것을 제거해줘야한다.
                    }
                    else stack.push(tmp);
                    break; //브레이크시켜서 for문을 멈추게 해야 한다.
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Sample6 sample6 = new Sample6();

        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] borad = new int[n][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                borad[i][j] = kb.nextInt();
            }
        }

        int k = kb.nextInt();
        int[] moves = new int[k];
        for(int i = 0; i < k; i++) {
            moves[i] = kb.nextInt();
        }

        System.out.println(sample6.solution(n, borad, k, moves));
    }
}
