package Practice;

public class pr3 {


   class Solution {
      public int solution(double n) {
            Double sqrt = Math.sqrt(n);
            int answer = 0;

            if(sqrt == sqrt.intValue()) {
                answer = 1;
            } else {
                answer = 2;
            }

            return answer;
        }
    }


}
