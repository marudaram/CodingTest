package Practice4;

import java.util.Arrays;
import java.util.Stack;

public class pr2 {

    public static void main(String[] args) {
        int[] arr = {9, 1, 5, 3, 6, 2};
        System.out.println(Arrays.toString(pr2.solution(arr)));
    }

    public static int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Stack<Integer> s = new Stack<>();

        for(int i=numbers.length-1; i>=0; i--){
            while(!s.isEmpty()){
                if(s.peek() > numbers[i]){
                    answer[i] = s.peek();
                    break;
                }else{
                    s.pop();
                }
            }
            if(s.isEmpty()){
                answer[i] = -1;
            }
            s.push(numbers[i]);
        }
        return answer;

    }
}
