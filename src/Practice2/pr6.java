package Practice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class pr6 {

    public static void main(String[] args) {
        int[] test = {3, 30, 34, 35, 5, 9};
        System.out.println(pr6.solution(test));
    }

    public static String solution(int[] numbers) {
        String answer = "";

        System.out.println(Arrays.toString(numbers));

        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            arr.add(Integer.toString(numbers[i]));
        }
        System.out.println(arr);


        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i).charAt(0)  < arr.get(j).charAt(0)) {
                    Collections.swap(arr, i, j);
                }
            }
        }
        System.out.println(answer);
        for(int i = 0; i < arr.size(); i++) {
            answer += arr.get(i);
        }


        return answer;
    }

}

