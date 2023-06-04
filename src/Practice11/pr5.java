package Practice11;

import java.util.ArrayList;
import java.util.Collections;

public class pr5 {
    public static void main(String[] args) {
        System.out.println(pr5.solution("-4 -3 -2 -1"));
    }
    public static String solution(String s) {
        String answer = "";

        String[] arr = s.split(" ");
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            list.add(Integer.parseInt(arr[i]));
        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        System.out.println(list.get(0));
        for(int i = 0; i < list.size(); i++) {
            if(i == 0) answer += list.get(0) + " ";
            else if(i == list.size()-1) answer += list.get(list.size()-1);
        }
        System.out.println(answer);
        return answer;
    }
}
