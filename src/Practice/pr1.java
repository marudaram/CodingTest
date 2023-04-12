package Practice;

public class pr1 {

    public static void main(String[] args) {
        int arr1[] = {4, 7, 12};
        boolean arr2[] = {true, false, true};

        System.out.println(pr1.solution(arr1, arr2));
    }


    public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for(int i = 0; i < absolutes.length; i++) {
            if(signs[i] == false) {
                absolutes[i] = -(absolutes[i]);
            }
            answer += absolutes[i];
        }

        return answer;
    }

}
