package Practice9;

import java.util.Arrays;

public class pr7 {
    public static void main(String[] args) {
        int[] arr = {2, 1, 6};
        System.out.println(Arrays.toString(pr7.solution(arr, 1)));
    }
    public static int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];

        int index = 0;

        for(int i = n; i < num_list.length; i++) {
            answer[index++] = num_list[i];
        }

        for(int i = 0; i < n; i++) {
            answer[index++] = num_list[i];
        }

        return answer;
    }
}
