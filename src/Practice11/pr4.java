package Practice11;

public class pr4 {
    public static void main(String[] args) {
        System.out.println(pr4.solution(13, 17));
    }
    public static int solution(int left, int right) {
        int answer = 0;
        int count = 0;

        for(int i = left; i <= right; i++) {
            count = 0;
            for(int j = 1; j <= i; j++) {
                if(i % j == 0) count++;
            }
            if(count % 2 == 0) answer += i;
            else answer -= i;
        }

        return answer;
    }
}
