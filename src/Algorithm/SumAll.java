package Algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class SumAll {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] arr = new int[num];
        for(int i = 0; i < num; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("배열: " + Arrays.toString(arr));
        System.out.println("배열의 합: " + sumOf(arr));

    }

    static int sumOf(int[] a) {
        int sum = 0;
        for(int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

}
