package Algorithm;

public class Min2 {

    public static void main(String[] args) {
        System.out.println(min4(3, 2, 5, 1));
    }

    //3. 네 값의 최솟값을 구하는 메서드를 작성하세요
    static int min4(int a, int b, int c, int d) {
        int min = a;
        if(a > b) min = b;
        if(b > c) min = c;
        if(c > d) min = d;

        return min;
    }
}
