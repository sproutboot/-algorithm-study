package algorithm.hash;

import java.util.HashMap;
import java.util.Scanner;

public class Sample3 {

    public int solution(String s1, String s2) {
        int answer = 0;

        HashMap<Character, Integer> am = new HashMap<>();
        HashMap<Character, Integer> bm = new HashMap<>();

        for(char x : s2.toCharArray()) bm.put(x, bm.getOrDefault(x, 0) + 1);
        int L = s2.length()-1;
        for(int i = 0; i < L; i++) am.put(s1.charAt(i), am.getOrDefault(s1.charAt(i), 0) +1);

        int lt = 0;
        for(int rt = L; rt < s1.length(); rt++) {
            am.put(s1.charAt(rt), am.getOrDefault(s1.charAt(rt), 0) + 1);
            if(am.equals(bm)) answer++;
            am.put(s1.charAt(lt), am.get(s1.charAt(lt)) - 1);
            if(am.get(s1.charAt(lt)) == 0) am.remove(s1.charAt(lt));
            lt++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Sample3 sample3 = new Sample3();

        Scanner kb = new Scanner(System.in);
        String s1 = kb.next();
        String s2 = kb.next();

        System.out.print(sample3.solution(s1,s2));
    }
}
