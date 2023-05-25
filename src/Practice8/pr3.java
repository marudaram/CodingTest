package Practice8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class pr3 {

    public static void main(String[] args) {
        System.out.println(pr3.solution("one4seveneight"));
    }
    public static int solution(String s) {
        int answer = 0;
        Map<String, String> map = new HashMap<>();
        map.put("0", "zero");
        map.put("1", "one");
        map.put("2", "two");
        map.put("3", "three");
        map.put("4", "four");
        map.put("5", "five");
        map.put("6", "six");
        map.put("7", "seven");
        map.put("8", "eight");
        map.put("9", "nine");

        String[] arr = s.split("");
        System.out.println(Arrays.toString(arr));

        ArrayList<String> newArr = new ArrayList<>();

        for(int i = 0; i < s.length(); i++) {
//            if(newArr.add(arr[i].equals(map.())))

            if(arr[i].equals(map.containsKey(map.get(i)))) {

            }
        }

        return answer;
    }

}
