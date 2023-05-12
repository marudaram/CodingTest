package Practice3;

import java.util.HashMap;
import java.util.Map;

public class pr1 {

    public static void main(String[] args) {
        String[] arr = {"meosseugi", "1234"};
        String [][] arr2 = {{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "12345"}};
        System.out.println(pr1.solution(arr, arr2));
    }

    public static String solution(String[] id_pw, String[][] db) {
        String answer = "";

        Map<String, String> map = new HashMap<>();

        for (int i = 0; i < db.length; i++) {
            map.put(db[i][0], db[i][1]);
            System.out.println(map);
            System.out.println(map.get(db[i][0]));

            if (map.containsKey(id_pw[0]) && id_pw[1].equals(map.get(db[i][0]))) {
                answer = "login";
            } else if(map.containsKey(id_pw[0]) && !id_pw[1].equals(map.get(db[i][0]))) {
                answer =  "wrong pw";
                break;
            } else if(!map.containsKey(id_pw[0])) {
                answer =  "fail";
                break;
            }
        }


        return answer;
    }
}
