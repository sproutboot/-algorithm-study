package algorithm.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

class Lecture implements Comparable<Lecture> {
    public int money;
    public int date;

    Lecture(int money, int date) {
        this.money = money;
        this.date = date;
    }

    @Override
    public int compareTo(Lecture lecture) {
        return lecture.date - this.date; //내림차순 정렬하기 위해서
    }
}

public class Sample5 {
    static int n, max = Integer.MIN_VALUE;

    public int solution(ArrayList<Lecture> arr) {
        int answer = 0;
        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
        Collections.sort(arr);
        int j = 0;
        for(int i = max; i >= 1; i--) {
            for( ; j < n; j++) {
                if(arr.get(j).date < i) break;
                pQ.offer(arr.get(j).money);
            }
            if(!pQ.isEmpty()) answer += pQ.poll();
        }

        return answer;
    }

    public static void main(String[] args) {
        Sample5 sample5 = new Sample5();
        Scanner kb = new Scanner(System.in);

        n = kb.nextInt();
        ArrayList<Lecture> arr = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            int m = kb.nextInt();
            int d = kb.nextInt();
            arr.add(new Lecture(m, d));
            if(d > max) max = d;
        }

        System.out.println(sample5.solution(arr));
    }
}
