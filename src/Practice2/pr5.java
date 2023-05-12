package Practice2;

public class pr5 {

    public static void main(String[] args) {
        System.out.println(pr4.solution(1, 13, 1));
    }

    public static int solution(int i, int j, int k) {
        int answer = 0;

        int[] arr = new int[j-i];

        for(int b = i; b <= j; b++) {
            arr[i] = b;
        }

        for(int a = 0; a < arr.length; a++) {
            if(arr[a] == k) {
                answer++;
            }
        }

        return answer;
    }
}
