package Practice7;

import java.util.Arrays;
import java.util.Stack;

public class pr2 {

    public static void main(String[] args) {
        int[] arr = {4, 4, 4, 3, 3};
        System.out.println(Arrays.toString(pr2.solution(arr)));
    }

    public static int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < arr.length; i++) {
            if(stack.isEmpty()) stack.push(arr[i]);
            else if(stack.peek() != arr[i]) stack.push(arr[i]);
        }

        int[] answer = new int[stack.size()];

        for(int i = answer.length-1; i >= 0; i--) {
            answer[i] = stack.pop();
        }

        return answer;
    }
}
