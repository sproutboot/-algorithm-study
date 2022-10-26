package algorithm.dfsandbfs;

import java.util.ArrayList;
import java.util.Scanner;

class Coordinate {
    int x, y;
    Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Sample26 {
    static int n, m, len, answer = Integer.MAX_VALUE; //도시 배달거리의 최소값을 저장
    static int[] combi;
    static ArrayList<Coordinate> hs, pz;

    public void DFS(int L, int s) {
        if(L == m) { //조합이 완성
            int sum = 0;
            for(Coordinate h : hs) {
                int dis = Integer.MAX_VALUE; //최소값 구해야 한다. 가장 큰 값으로 초기화
                for(int i : combi) {
                    dis = Math.min(dis, Math.abs(h.x-pz.get(i).x) + Math.abs(h.y-pz.get(i).y)); //거리값 구한 것
                }
                sum += dis;
            }
            answer = Math.min(answer, sum); //기존값 보다 sum이 작다면 answer를 바꿔준다.
        }
        else {
            for(int i = s; i < len; i++) { //len개 중에서 m개를 뽑는다.
                combi[L] = i;
                DFS(L+1, i+1);
            }
        }
    }

    public static void main(String[] args) {
        Sample26 sample26 = new Sample26();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt(); //도시에서 살려하는 피자집의 개수
        pz = new ArrayList<>();
        hs = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                int tmp = kb.nextInt(); //각각 하나의 값을 읽는다.
                if(tmp == 1) hs.add(new Coordinate(i, j));
                else if(tmp == 2) pz.add(new Coordinate(i, j));
            }
        }

        len = pz.size(); //도시에 있는 피자집의 개수 len에서 m을
        combi = new int[m];
        sample26.DFS(0, 0);
        System.out.println(answer);
    }
}
