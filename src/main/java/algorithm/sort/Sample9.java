package algorithm.sort;

import java.util.Arrays;
import java.util.Scanner;

public class Sample9 {

     public String solution(int n, int[] arr) {
          String answer = "U";
          Arrays.sort(arr);

          for(int i = 0; i < n-1; i++) {
               if(arr[i] == arr[i+1]) return "D";
          }

          return answer;
     }

     public static void main(String[] args) {
          Sample9 sample9 = new Sample9();

          Scanner kb = new Scanner(System.in);
          int n = kb.nextInt();
          int[] arr = new int[n];

          for(int i = 0; i < n; i++) arr[i] = kb.nextInt();

          System.out.println(sample9.solution(n, arr));
     }

}
