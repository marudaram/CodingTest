package Algorithm;

import java.util.Scanner;

public class For1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        String str = "";

        for (int i = 1; i <= n; i++) {
            sum += i;
            if(i == n) str += i;
            else str += i + "+";
        }
        System.out.println(str + "=" + sum);
    }

}
