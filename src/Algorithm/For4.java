package Algorithm;

import java.util.Scanner;

public class For4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 0;

        while(n <= 0) {
            n /= 10;
            a++;
        }
        System.out.println("그 수는 " + a + "번째 자리입니다.");

    }
}
