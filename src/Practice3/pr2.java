package Practice3;

public class pr2 {

    public static void main(String[] args) {
        System.out.println(pr2.solution(5, 3, 21));
    }

    public static int solution(int a, int b, int n) {
        int answer = 0;
        int remain = 0;

        while (n >= a) {
            answer += (n/a*b);
            n = (n/a*b) + n%a;
            System.out.println(answer);
            System.out.println("n: " + n);

        }

        return answer;
    }
}
