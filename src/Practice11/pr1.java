package Practice11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class pr1 {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7};
        System.out.println(Arrays.toString(pr1.solution(arr)));
    }
    public static int[] solution(int[] arr) {

        ArrayList<Integer> array = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            array.add(arr[i]);
        }
        ArrayList<Integer> copyOfArray = (ArrayList<Integer>) array.clone();
        System.out.println(array);
        System.out.println(copyOfArray);
        Collections.sort(array);
        System.out.println(array);
//        int n = array.get(0);
        copyOfArray.remove(array.get(0));
        System.out.println(copyOfArray);

        int[] answer = new int[copyOfArray.size()];
        if(arr.length == 1) {
            answer = new int[1];
            answer[0] = -1;
        }
        for(int i = 0; i < copyOfArray.size(); i++) {
            answer[i] = copyOfArray.get(i);
        }


        return answer;
    }
}
