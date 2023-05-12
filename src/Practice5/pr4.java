package Practice5;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class pr4 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(pr4.solution("banana")));
    }

    public static int[] solution(String s) {
        int[] answer = new int[s.length()];

        String[] arr = s.split("");
        Map<Integer, String> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++) {
            map.put(i, arr[i]);
        }



        return answer;
    }
}
