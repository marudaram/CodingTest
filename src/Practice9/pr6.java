package Practice9;

import java.util.Arrays;

public class pr6 {

    public static void main(String[] args) {
        int[] arr = {2, 1, 6};
        System.out.println(Arrays.toString(pr6.solution(arr, 1)));
    }
    public static int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];

        String str = "";
        for(int i = 0; i < num_list.length; i++) {
            str += Integer.toString(num_list[i]);
        }

        String sum = str.substring(n) + str.substring(0, n);
        System.out.println(sum);
        String[] result = sum.split("");
        System.out.println(Arrays.toString(result));
        for(int i = 0; i < result.length; i++) {
            answer[i] = Integer.parseInt(result[i]);
        }
        return answer;
    }
}
