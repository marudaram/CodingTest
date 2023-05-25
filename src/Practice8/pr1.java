package Practice8;

import java.util.*;

public class pr1 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 4, 5, 2, 3};
        System.out.println(pr1.solution(6, arr));
    }

    public static int solution(int k, int[] tangerine) {
        int answer = 0;

        Map<Integer, Integer> map = new HashMap<>();
        for (int tan : tangerine) {
            map.put(tan, map.getOrDefault(tan, 0) + 1);
        }
        System.out.println(map);

        ArrayList<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list, Collections.reverseOrder());

        for (int i = 0; i < list.size(); i++) {
            answer++;
            k -= list.get(i);
            if (k <= 0) break;
        }
        System.out.println(list);
        return answer;
    }


}
