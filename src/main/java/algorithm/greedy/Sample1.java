package algorithm.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Body implements Comparable<Body> {
    public int h, w;
    Body(int h, int w) {
        this.h = h;
        this.w = w;
    }

    @Override
    public int compareTo(Body body) {
        return body.h - this.h;
    }
}

public class Sample1 {

    public int solution(ArrayList<Body> arr, int n) {
        int cnt = 0;
        Collections.sort(arr);
        int max = Integer.MIN_VALUE;

        for(Body ob : arr) {
            if(ob.w > max) {
                max = ob.w;
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Sample1 sample1 = new Sample1();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList<Body> arr = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            int h = kb.nextInt();
            int w = kb.nextInt();
            arr.add(new Body(h, w));
        }

        System.out.println(sample1.solution(arr, n));
    }


}
