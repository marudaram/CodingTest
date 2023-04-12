package Practice;

import java.util.Arrays;

public class pr5 {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(pr5.solution(arr, 4)));
    }

    public static int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];

//        for(int i = 0; i < numlist.length; i++) {
//            if(numlist[i] == n) {
//                numlist[0] = n;
//            } else if(Math.abs(n - numlist[i]) < Math.abs(n - numlist[i+1])) {
//
//            }
//        }

//        for(int i = 0; i < numlist.length-1; i++) {
//            for(int j = i+1; j < numlist.length; j++) {
//                if(numlist[i] == n) {
//                    answer[0] = n;
//                } else if(Math.abs(n - numlist[i]) == Math.abs(n - numlist[j])) {
//                    if(n - numlist[i] < n - numlist[j]) {
//                        answer[i] += numlist[i];
//                    } else {
//                        answer[i+1] += numlist[j];
//                    }
//                } else if(Math.abs(n - numlist[i]) > Math.abs(n - numlist[j])) {
//                    answer[numlist.length-1] += numlist[i];
//                } else {
//                    answer[numlist.length-1] += numlist[j];
//                }
//            }
//        }

        int temp;
        for(int i = 0; i < numlist.length-1; i++) {
            for(int j = i+1; j < numlist.length; j++) {
                if(Math.abs(n - numlist[i]) < (Math.abs(n - numlist[j]))) {
                    temp = answer[j];
                    answer[i] = numlist[i];
                    answer[j] = temp;
                }
            }
        }


        return answer;
    }
}
