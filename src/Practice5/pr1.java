package Practice5;


public class pr1 {

    public static void main(String[] args) {
        System.out.println(pr1.solution("10203", "15"));

    }

    public static int solution(String t, String p) {
        int answer = 0;

        int len = p.length();

        for(int i = 0; i <= t.length()-len; i++) {
            if(Long.parseLong(t.substring(i, (i+len))) <= Long.parseLong(p)) {
                answer++;
            }
        }

        return answer;
    }
}
