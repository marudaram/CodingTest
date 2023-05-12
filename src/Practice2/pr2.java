package Practice2;

import java.util.ArrayList;
import java.util.Arrays;

public class pr2 {

    public static void main(String[] args) {
        System.out.println(pr2.solution("())()(()")); // false로 나와야함,,
    }

    static boolean solution(String s) {
        boolean answer = true;
        int left1 = 0;
        int right1 = 0;

        int left2 = 0;
        int right2 = 0;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        String[] arr = s.split("");
        System.out.println(Arrays.toString(arr));

        for(int i = 0; i < (arr.length/2); i++) {
            if(arr[i].equals("(")) {
                left1++;
            } else if(arr[i].equals(")")) {
                right1++;
            }
        }

        for(int i = arr.length/2; i < arr.length; i++) {
            if(arr[i].equals("(")) {
                left2++;
            } else if(arr[i].equals(")")) {
                right2++;
            }
        }

        System.out.println("left1:" + left1);
        System.out.println("left2:" + left2);
        System.out.println("right1:" + right1);
        System.out.println("right2:" + right2);

        if(arr[0].equals(")") || arr[arr.length-1].equals("(")) {
            answer = false;
        } else if(arr[0].equals("(") && arr[1].equals(")") && arr[2].equals(")")) {
            answer = false;
        }  else if(left1 == right2 && left2 == right1) {
            answer = true;
        } else {
            answer = false;
        }



        return answer;
    }
}
