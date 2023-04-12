package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class pr7 {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(pr7.solution(arr, 4));
    }

    public static ArrayList<Integer> solution(int[] numlist, int n) {
        ArrayList<Integer> answer = new ArrayList<>(numlist.length);
        ArrayList<Integer> real = new ArrayList<>(numlist.length);



        for(int i = 0; i < numlist.length; i++) {

            if(n - numlist[i] >= 0) {
                answer.add(n - numlist[i]);
            } else if(n - numlist[i] < 0) {
                answer.add((n - numlist[i]));
            }


//                Collections.sort(answer);



//                if(Math.abs(answer.get(i)) > Math.abs(answer.get(j))) {
//                    Collections.swap(answer, i, j);
//
//                    if(answer.get(i) < 0) {
//                        Collections.swap(answer, i, i-1);
//                    }
//
//
//                }

        }

//        for(int i = 0; i < numlist.length; i++) {
//            if(answer.get(i) <= 0) {
//                real.add(n + Math.abs(answer.get(i)));
//            } else if(answer.get(i) > 0) {
//                real.add(n - answer.get(i));
//            }
//
//        }


        return answer;
    }
}
