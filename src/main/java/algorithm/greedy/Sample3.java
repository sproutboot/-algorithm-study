package algorithm.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Time2 implements Comparable<Time2> {
    public int time;
    public char state;

    Time2(int time, char state) {
        this.time = time;
        this.state = state;
    }

    @Override
    public int compareTo(Time2 time) {
        if(this.time == time.time) return this.state - time.state;
        else return this.time - time.time;
    }
}

public class Sample3 {

    public int solution(ArrayList<Time2> arr) {
        int answer = Integer.MIN_VALUE;
        Collections.sort(arr);
        int cnt = 0;

        for(Time2 ob : arr) {
            if(ob.state == 's') cnt++;
            else cnt--;
            answer = Math.max(answer, cnt);
        }

        return answer;
    }

    public static void main(String[] args) {
        Sample3 sample3 = new Sample3();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        ArrayList<Time2> arr = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            int sT = kb.nextInt();
            int eT = kb.nextInt();
            arr.add(new Time2(sT, 's'));
            arr.add(new Time2(eT, 'e'));
        }

        System.out.println(sample3.solution(arr));
    }
}
