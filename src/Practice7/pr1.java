package Practice7;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class pr1 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(pr1.solution("banana")));
    }

    public static int[] solution(String s) {
        int[] answer = new int[s.length()];

        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            if(!map.containsKey(s.charAt(i))) {
                answer[i] = -1;
            } else {
                answer[i] = i - map.get(s.charAt(i));
            }
                map.put(s.charAt(i), i);
        }

        return answer;
    }
}
