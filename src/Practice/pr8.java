package Practice;

import java.util.ArrayList;
import java.util.Collections;

public class pr8 {

    public static void main(String[] args) {
        int[] arr = {10000,20,36,47,40,6,10,7000};
        System.out.println(pr8.solution(arr, 30));
    }

    public static ArrayList<Integer> solution(int[] numlist, int n) {
        ArrayList<Integer> answer = new ArrayList<>(numlist.length);
        ArrayList<Integer> real = new ArrayList<>(numlist.length);

        for (int i = 0; i < numlist.length; i++) {
            answer.add(n - numlist[i]);
            Collections.sort(answer);
//            Math.abs(answer.get(i));
        }


        for (int i = 0; i < numlist.length; i++) {
            for (int j = i + 1; j < numlist.length; j++) {
                if (Math.abs(answer.get(i)) > Math.abs(answer.get(j))) {
                    Collections.swap(answer, i, j);
                }
            }
        }

        for(int i = 0; i < numlist.length; i++) {
            if(answer.get(i) <= 0) {
                real.add(n + Math.abs(answer.get(i)));
            } else if(answer.get(i) > 0) {
                real.add(n - answer.get(i));
            }

        }
        return real;
    }
}
