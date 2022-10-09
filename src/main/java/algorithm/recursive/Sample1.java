package algorithm.recursive;

public class Sample1 {

    public void DFS(int n) {

        if(n == 0) return; //void에서 함수 종료의 의미 or 반환하는 값
        else { //0이 아니면
            DFS(n - 1); //자기가 자기 자신을 호출
            System.out.print(n+ " ");
        }
    }

    public static void main(String[] args) {
        Sample1 sample1 = new Sample1();
        sample1.DFS(3);
    }
}
