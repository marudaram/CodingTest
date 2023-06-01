package Practice11;

public class pr2 {
    public static void main(String[] args) {
        System.out.println(pr2.solution("abcd"));
    }
    public static String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        for(int i = 0; i < s.length(); i++) {
            if(s.length() % 2 != 0) {
                answer = arr[s.length()/2];
            } else {
                answer = arr[s.length()/2 -1] + arr[s.length()/2];
            }
        }

        return answer;
    }
}
