package Practice10;


import java.util.Arrays;

public class pr1 {
    public static void main(String[] args) {
        System.out.println(pr1.solution("for the last week"));
    }
    public static String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ");
        System.out.println(Arrays.toString(arr));
        String str = "";

        for(int i = 0; i < arr.length; i++) {
            str = arr[i];
            if(arr[i].equals(" ")) answer += " ";
            else {
                answer += str.substring(0, 1).toUpperCase();
                answer += str.substring(1, str.length()).toLowerCase();
            }
            if(i != arr.length-1)
            answer += " ";
        }
        System.out.println(Arrays.toString(arr));

        return answer;
    }
}
