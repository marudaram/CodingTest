package Practice9;

import java.util.Arrays;

public class pr4 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(pr4.solution("oxooxoxxox")));
        System.out.println(Arrays.toString(pr4.solution("xabcxdefxghi")));
    }

    public static int[] solution(String myString) {
        String[] arr = myString.split("x", -1);
        int[] answer = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            answer[i] = arr[i].length();
        }

        return answer;

    }
}
