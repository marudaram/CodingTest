package Practice12;

import java.util.Arrays;

public class pr1 {
    public static void main(String[] args) {
        System.out.println(pr1.solution("Zcbdefg"));
    }
    public static String solution(String s) {
        String answer = "";
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        System.out.println(arr);
        for(int i = arr.length-1; i >= 0; i--) {
            answer += arr[i];
        }
        return answer;
    }
}
