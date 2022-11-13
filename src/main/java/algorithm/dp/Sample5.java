package algorithm.dp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Brick implements Comparable<Brick> {
    public int s, h, w;

    Brick(int s, int h, int w) {
        this.s = s;
        this.h = h;
        this.w = w;
    }

    @Override
    public int compareTo(Brick brick) {
        return brick.s - this.s; //넓이를 내림차순으로 초기화 가장 앞에 있는 값이 가장 큰 값
    }
}

public class Sample5 {
    static int[] dy;

    public int solution(ArrayList<Brick> arr) {
        int answer = 0;
        Collections.sort(arr); //넓이에 의해 내림차순
        dy[0] = arr.get(0).h;
        answer = dy[0]; //초기화를 반드시 해주어야 한다.

        for(int i = 1; i < arr.size(); i++) {
            int max = 0;
            for(int j = i-1; j >= 0; j--) {
                if(arr.get(i).w < arr.get(j).w && dy[j] > max) max = dy[j];
            }
            dy[i] = max + arr.get(i).h;
            answer = Math.max(answer, dy[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        Sample5 sample5 = new Sample5();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        ArrayList<Brick> arr = new ArrayList<>();
        dy = new int[n];

        for(int i = 0; i < n; i++) {
            int s = kb.nextInt();
            int h = kb.nextInt();
            int w = kb.nextInt();
            arr.add(new Brick(s,h,w));
        }

        System.out.println(sample5.solution(arr));
    }
}
