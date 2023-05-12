package Practice3;

public class pr3 {

    public static void main(String[] args) {
        System.out.println(pr3.solution("<", "=", 2, 3));
    }

    public static int solution(String ineq, String eq, int n, int m) {
        int answer = 0;

        System.out.println(ineq + eq);

        String a = ineq + eq;

        System.out.println(a);
        System.out.println(2 + a + 3);

        if(ineq.equals("<") && eq.equals("=")) {
            if(n <= m) {
                answer = 1;
            } else {
                answer = 0;
            }
        } else if(ineq.equals("<") && eq.equals("!")) {
            if(n < m) {
                answer = 1;
            } else {
                answer = 0;
            }
        } else if(ineq.equals(">") && eq.equals("=")) {
            if(n >= m) {
                answer = 1;
            } else {
                answer = 0;
            }
        } else if (ineq.equals(">") && eq.equals("!")) {
            if(n > m) {
                answer = 1;
            } else {
                answer = 0;
            }
        }


        return answer;
    }
}
