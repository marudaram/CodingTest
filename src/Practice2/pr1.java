package Practice2;

import java.util.ArrayList;
import java.util.Collections;

public class pr1 {

    public static void main(String[] args) {
        int[] arr1 = {2,2,3,3};
        System.out.println(pr1.solution(arr1, 10));
    }

    public static int solution(int[] d, int budget) {
        int answer = 0;
        int plus = 0;

        ArrayList<Integer> arr = new ArrayList<>(d.length);

        for (int i = 0; i < d.length; i++) {
            arr.add(d[i]);
        }

        Collections.sort(arr);
        System.out.println(arr.toString());

        for (int i = 0; i < d.length; i++) {
            plus += arr.get(i);
            if (plus <= budget) {
                answer++;
            } else if(plus == budget){
                answer++;
            } else {
                break;
            }
        }

        System.out.println("dd" + plus);
        System.out.println(arr.size());

        return answer;
    }

}
