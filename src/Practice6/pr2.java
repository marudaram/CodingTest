package Practice6;

public class pr2 {

    public static void main(String[] args) {
        System.out.println(solution(98, 2));
    }
    public static int solution(int num, int n) {
        int answer = 0;

        if(num % n == 0) answer = 1;
        else answer = 0;

        return answer;
    }
}
