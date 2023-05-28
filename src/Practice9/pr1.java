package Practice9;

import java.util.Scanner;

public class pr1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        String s = "";
        for(int i = 1; i <= n; i++) {
            s += str;
        }
        System.out.println(s);
    }
}
