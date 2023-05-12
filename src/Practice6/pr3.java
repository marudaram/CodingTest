package Practice6;

public class pr3 {

    public static void main(String[] args) {
        System.out.println(solution("Progra21Sremm3", 6, 12));
    }
    public static String solution(String my_string, int s, int e) {
        String answer = "";
        String temp = "";
        String[] my_string_arr = my_string.split("");
        for(int i = s; i <= e; i++) {
            temp = my_string_arr[i];
            my_string_arr[i] = my_string_arr[e];
            my_string_arr[e] = temp;
            e--;
        }
        for (String str : my_string_arr) {
            answer += str;
        }
        return answer;
    }
}
