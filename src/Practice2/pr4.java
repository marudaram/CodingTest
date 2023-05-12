package Practice2;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class pr4 {

    public static void main(String[] args) {
        System.out.println(pr4.solution(1, 13, 1));
    }

    public static int solution(int i, int j, int k) {
        int answer = 0;

        String k2 = Integer.toString(k);

        String str = "";

        for(int b = i; b <= j; b++) {
            str += b;
        }
        String[] arr = str.split("");
        for(int a = 0; a < arr.length; a++) {
            if(arr[a].equals(k2)) {
                answer++;
            }
        }
        return answer;
    }
}
