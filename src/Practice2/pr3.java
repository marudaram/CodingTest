package Practice2;

public class pr3 {

    public static void main(String[] args) {
        System.out.println(pr3.solution("())()(()"));
    }

    static boolean solution(String s) {
        boolean answer = true;

        int open = 0;
        int close = 0;


        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' ) open++;
            else if(s.charAt(i) == ')' ) close++;
            if(open - close == -1) return false;

        }

        if(open == close) return true;
        else return false;



    }
}
