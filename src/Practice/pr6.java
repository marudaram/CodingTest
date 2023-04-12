package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class pr6 {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(pr6.solution(arr, 4));
    }

    public static ArrayList<Integer> solution(int[] numlist, int n) {
        ArrayList<Integer> answer = new ArrayList<>(numlist.length);
        ArrayList<Integer> real = new ArrayList<>(numlist.length);

        for(int i = 0; i < numlist.length; i++) {
            answer.add(n - numlist[i]);
            if(answer.get(i) == 0) {
                Collections.swap(answer, 0, i);
            }
        }

        for(int i = 1; i < numlist.length; i++) {
            for(int j = i+1; j < numlist.length; j++) {
                if(Math.abs(answer.get(i)) > Math.abs(answer.get(j))) {
                    Collections.swap(answer, i, j);

                    if(answer.get(i) < 0) {
                        Collections.swap(answer, i, i-1);
                    }
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

