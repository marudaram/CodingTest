package Practice4;


public class pr3 {

    public static void main(String[] args) {
        String[] arr = {"americanoice", "americano", "iceamericano"};
        System.out.println(pr3.solution(arr));
    }

    public static int solution(String[] order) {
        int answer = 0;

        for(int i = 0; i < order.length; i++) {
            if(order[i].contains("americano")) {
                answer += 4500;
            } else if(order[i].contains("cafelatte")) {
                answer += 5000;
            } else if(order[i].equals("anything")) {
                answer += 4500;
            }
        }
        return answer;
    }
}
