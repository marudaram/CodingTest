package Practice;

public class pr9 {

    public static void main(String[] args) {
        System.out.println(pr9.solution("try hello world"));
    }

    public static String solution(String s) {
        String answer = "";

        String[] arr = s.split("");

        for(int i = 0; i < arr.length; i++) {
            if(arr[i].equals(" ")) {
                answer += " ";
            } else if(i % 2 == 0) {
                answer += arr[i].toUpperCase();
            } else if(i % 2 == 1) {
                answer += arr[i].toLowerCase();
            }
        }

        return answer;
    }
}
