package Practice11;

import java.util.ArrayList;

public class pr4 {
    public static void main(String[] args) {
        System.out.println(pr4.solution(13, 17));
    }
    public static int solution(int left, int right) {
        int answer = 0;
        int count = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = left; i <= right; i++) {
            if(i % 2 == 0) {
                arr.add(i);
                count++;
            }

//            if(count % 2 == 0) {
//                answer += arr.get(i);
//            } else {
//                answer -= arr.get(i);
//            }
        }
        System.out.println(arr);
        System.out.println(count);
        return answer;
    }
}
