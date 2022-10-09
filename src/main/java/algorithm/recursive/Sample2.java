package algorithm.recursive;

public class Sample2 {

    public void DFS(int n) {
        if(n==0) return;
        else {
            DFS(n / 2);
            System.out.print(n % 2 + " ");
        }
    }

    public static void main(String[] args) {
        Sample2 sample2 = new Sample2();
        sample2.DFS(11);
    }
}
