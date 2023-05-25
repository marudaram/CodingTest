package Practice8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class pr2 {

    public static void main(String[] args) {
        int[] arr = {1, 16, 6, 15, 0, 10, 11, 3};
        System.out.println(pr2.solution("apporoograpemmemprs", arr));
    }

    public static String solution(String my_string, int[] indices) {
        String answer = "";

        String[] arr = my_string.split("");
        Integer[] integerArray = Arrays.stream(indices).boxed().toArray(Integer[]::new);
        ArrayList<String> result = new ArrayList<>(Arrays.asList(arr));
        Arrays.sort(integerArray, Collections.reverseOrder());

        // Integer 배열의 길이에 맞는 int 배열 생성
        int[] intArray = new int[integerArray.length];

        // Integer 배열의 각 요소를 int로 변환하여 할당
        for (int i = 0; i < integerArray.length; i++) {
            intArray[i] = integerArray[i].intValue();
        }

        for(int i = 0; i < integerArray.length; i++) {
            result.remove(intArray[i]);
        }
        System.out.println(result);
        System.out.println(Arrays.toString(integerArray));


        for(String a : result) {
            answer += a;
        }

        return answer;
    }
}
