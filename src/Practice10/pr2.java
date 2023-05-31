package Practice10;

import java.util.StringTokenizer;

public class pr2 {
    public static void main(String[] args) {
        System.out.println(pr2.solution("for the last week"));
    }
    public static String solution(String s) {

        StringTokenizer st = new StringTokenizer(s, " ", true);
        StringBuilder sb = new StringBuilder();
        int uppercase = 'A' - 'a';
        System.out.println(uppercase);

        while (st.hasMoreTokens()) {
            String str = st.nextToken();
            if(str.equals(" ")) {
                sb.append(" ");
                continue;
            }
            char c = str.charAt(0);
            if(c >= 'a' && c <= 'z') {
                sb.append((char)(c + uppercase));
            } else sb.append(c);
            str = str.toLowerCase();
            for(int i = 1; i < str.length(); i++) {
                sb.append(str.charAt(i));
            }
        }

        String answer = sb.toString();

        return answer;
    }
}
