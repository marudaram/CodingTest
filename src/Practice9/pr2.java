package Practice9;

import java.util.Scanner;

public class pr2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] arr = a.toCharArray();
        String answer = "";
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] >= 65 && arr[i] <= 90) {
                arr[i] += 32;
            } else {
                arr[i] -= 32;
            }
        }

        for(char c : arr) {
            answer += c;
        }
        System.out.println(answer);
    }
}
