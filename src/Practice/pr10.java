package Practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;


public class pr10 {

    public static void main(String[] args) throws ParseException {
        String[] arr1 = {"A 6", "B 12", "C 3"};
        String[] arr2 = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
        System.out.println(pr10.solution("2022.05.19", arr1, arr2));
    }

    public static int[] solution(String today, String[] terms, String[] privacies) throws ParseException {
        int[] answer = {};

        String pattern = "yyyy.MM.dd";

        SimpleDateFormat formatter = new SimpleDateFormat(pattern);

        Date date = formatter.parse(today);

        String str = formatter.format(date);

        System.out.println(str);



        //split
        for (int i = 0; i < privacies.length; i++) {
            String[] newArr = privacies[i].split(" ");
            System.out.println(Arrays.toString(newArr));

            int year = Integer.parseInt(privacies[i].substring(0, 3));
            int month = Integer.parseInt(privacies[i].substring(5, 6));
            int day = Integer.parseInt(privacies[i].substring(8, 9));
            int period = 10;


            if (terms[0].equals(privacies[privacies.length - 1])) {
                    String[] updateDate = {};

                if (month + period > 12) {
                    year++;
                    month = (month + period) -12;
                    updateDate[i] += year + "." + month + "." + day;
                System.out.println("엥" + Arrays.toString(updateDate));
                }
            }
        }

        //배열 작업
        for (int i = 0; i < privacies.length; i++) {
            if (terms[0].equals(privacies[privacies.length - 1])) {

            }
        }


        return answer;
    }
}
