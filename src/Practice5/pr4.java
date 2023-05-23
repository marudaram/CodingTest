package Practice5;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class pr4 {


    public static void main(String[] args) {
        System.out.println(Arrays.toString(pr4.solution("banana")));
    }

    public static int[] solution(String s) {
        int[] answer = new int[s.length()];

        String[] arr = s.split("");
        Stack<String> stack = new Stack<>();
        int count = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty()) {
                if (stack.peek().equals(arr[i])) {
                    stack.pop();
                    count++;
                    answer[i] = count;

                } else {
                    answer[i] = -1;
                }
            }
            if (stack.isEmpty()) {
                stack.push(arr[arr.length - 1]);
            }
            stack.push(arr[i]);
        }


        return answer;
    }
}
