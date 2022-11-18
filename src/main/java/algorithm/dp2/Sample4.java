package algorithm.dp2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Brick implements Comparable<Brick> {
    public int s,h,w;

    Brick(int s, int h, int w) {
        this.s = s;
        this.h = h;
        this.w = w;
    }

    @Override
    public int compareTo(Brick brick) {
        return brick.s - this.s;
    }
}

public class Sample4 {
    static int[] dy;

    public int solution(ArrayList<Brick> arr) {
        int answer = 0;
        Collections.sort(arr); //밑면이 가장 넓은 것 내림차순
        dy[0] = arr.get(0).h;
        answer = dy[0];

        for(int i = 1; i < arr.size(); i++) {
            int max = 0;
            for(int j = i-1; j >= 0; j--) {
                if(arr.get(j).w > arr.get(i).w && dy[j] > max) max = dy[j];
            }
            dy[i] = max + arr.get(i).h;
            answer = Math.max(answer, dy[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        Sample4 sample4 = new Sample4();
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

        System.out.println(sample4.solution(arr));
    }
}
