package algorithm.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sample2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = {"D", "C", "B", "A", "E"};
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < 3; i++) {
            StringTokenizer str = new StringTokenizer(br.readLine());
            int sum = 0;

            while(str.hasMoreTokens()) {
                sum+= Integer.parseInt(str.nextToken());
            }
            sb.append(arr[sum] + "\n");
        }
        System.out.println(sb);
    }
}
