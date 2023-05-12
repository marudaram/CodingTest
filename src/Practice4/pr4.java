package Practice4;


import java.util.Arrays;
import java.util.Stack;

public class pr4 {

    public static void main(String[] args) {
        int[][] arr1 = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2}, {3,5,1,3,1}};
        int[] arr2 = {1,5,3,5,1,2,1,4};
        System.out.println(pr4.solution(arr1, arr2));
    }
    public static int solution(int[][] board, int[] moves) {
        int answer = 0;


        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < moves.length; i++) {
            for(int j = 0; j < board.length; j++) {

                    if (board[j][moves[i]-1] != 0) {
//                        System.out.println(board[j][moves[i]-1]);

                        if(!stack.isEmpty() && stack.peek() == board[j][moves[i]-1]) {
                            stack.pop();
                            answer += 2;
                            board[j][moves[i]-1] = 0;
                            System.out.println(stack);
                            break;
                        } else {
                            stack.push(board[j][moves[i]-1]);
                            board[j][moves[i]-1] = 0;
                            break;
                        }
                    }



                }
            }

//        for(int k = 0; k < board.length; k++) {
//
//        }


        System.out.println(Arrays.deepToString(board));

        return answer;
    }

}
