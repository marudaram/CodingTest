package Algorithm;

import java.awt.*;
import java.util.Scanner;

public class For2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;

        sum = (1 + n) * (n/2) + (n%2 == 0 ? 0 : (1+n)/2);
        System.out.println(sum);

    }
}
