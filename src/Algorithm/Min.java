package Algorithm;

public class Min {

    public static void main(String[] args) {
        System.out.println(min3(2, 4, 5));
    }

    //2. 세 값의 최솟값을 구하는 메서드를 작성하세요
    static int min3(int a, int b, int c) {
        int min = a;
        if(a > b) min = b;
        if(b > c) min = c;

        return min;
    }

}
