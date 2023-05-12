package Practice4;

import java.util.Arrays;

public class pr1 {

    public static void main(String[] args) {
        int[] arr = {2, 3, 3, 5};
        System.out.println(Arrays.toString(pr1.solution(arr)));
    }

    public static int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];

        for(int i = 0; i < numbers.length; i++) {
            for(int j = i+1; j < numbers.length; j++) {
                if(numbers[i] < numbers[j]) {
                    answer[i] = numbers[j];
                    break;
                } else if(numbers[i] > numbers[j]){
                    answer[i] = -1;
                }
            }
        }

        answer[numbers.length-1] = -1;

        return answer;
    }
}
