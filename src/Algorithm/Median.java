package Algorithm;

public class Median {

    public static void main(String[] args) {
        System.out.println(median(5, 3, 9));
    }

    //4. 세 값의 대소관계 13종류의 모든 조합에 대해 중앙값을 구하여 출력하는 프로그램을 작성하세요.
    static int median(int a, int b, int c) {
        int med = a;
        if(a > b) {
            if(b > c) med = b;
            else if(a < c) med = a;
            else med = c;
        }
        else if(a > c) {
            if(c > b) med = c;
            else if(b > c) med = a;
            else med = b;
        }
        return med;
    }

}
