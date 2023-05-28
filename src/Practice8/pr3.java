package Practice8;

public class pr3 {

    public static void main(String[] args) {
        System.out.println(pr3.solution("one4seveneight"));
    }
    public static int solution(String s) {
        int answer = 0;

        String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for(int i = 0; i < 10; i++) {
            s = s.replace(arr[i], Integer.toString(i));
        }
        System.out.println(s);
        answer = Integer.parseInt(s);

        return answer;
    }

}
