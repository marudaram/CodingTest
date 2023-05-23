package Practice7;

import java.util.ArrayList;
import java.util.Collections;

public class pr3 {

    public static void main(String[] args) {

        int[] arr = {1, 3, 4, 6};
        System.out.println(pr3.solution(arr));
    }

    public static String solution(int[] food) {
        String answer = "";

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 1; i < food.length; i++) {
            if(food[i] <= 1) continue;
            else {
                for(int j = 1; j <= food[i]/2; j++) {
                    arr.add(i);
                }
            }
        }
        arr.add(0);

        System.out.println(arr);

        ArrayList<Integer> arrClone = (ArrayList<Integer>)arr.clone();
        Collections.reverse(arr);
        for(int i = 0; i < arr.size(); i++) {
            arrClone.add(arr.get(i));
        }
        arrClone.remove(arrClone.size()/2);
        System.out.println(arrClone);

        for(int i = 0; i < arrClone.size(); i++) {
            answer += arrClone.get(i);
        }


        return answer;
    }

}
