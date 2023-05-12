package Algorithm;

public class Max {

    public static void main(String[] args) {
        System.out.println(max4(3, 2, 6, 8));
    }

    //1. 네 값의 최댓값을 구하는 메서드를 작성하세요
    static int max4(int a, int b, int c, int d) {
        int max = a;
        if(a < b) max = b;
        if(b < c) max = c;
        if(c < d) max = d;
        return max;
    }

}
