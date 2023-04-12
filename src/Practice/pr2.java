package Practice;

import java.util.Arrays;

public class pr2 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(pr2.solution(2, 5)));
    }

        public static long[] solution(int x, int n) {
            long[] answer = new long[n];

            long a = 0;
            for(int i = 0; i < n; i++) {
                a += x;
                answer[i] += a;
            }
            return answer;
        }

}

