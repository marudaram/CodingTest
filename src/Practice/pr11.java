package Practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class pr11 {

    public static void main(String[] args) throws ParseException {

        String[] arr1 = {"Z 3", "D 5"};
        String[] arr2 = {"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"};
        System.out.println(pr11.solution("2020.01.01", arr1, arr2));

    }

    public static ArrayList<Integer> solution(String today, String[] terms, String[] privacies) throws ParseException {
        ArrayList<Integer> answer = new ArrayList<>();

        String pattern = "yyyy.MM.dd";
        SimpleDateFormat formatter = new SimpleDateFormat(pattern);
        Date date = formatter.parse(today);
        String str2 = formatter.format(date);

        String str = String.join(" ", terms);
        System.out.println("str" + str);
        String[] newArr = str.split(" ");
        System.out.println("newArr" + Arrays.toString(newArr));

        String[] period;
        period = new String[privacies.length];

        int count = 0;

        for (int i = 0; i < privacies.length; i++) {
        loop:
            for (int j = 0; j < newArr.length; j+=2) {


                int year = Integer.parseInt(privacies[i].substring(0, 4));
                int month = Integer.parseInt(privacies[i].substring(5, 7));
                int day = Integer.parseInt(privacies[i].substring(8, 10));
//                System.out.println("년" + year);
//                System.out.println("월" + month);
//                System.out.println("일" + day);

                if (privacies[i].contains(newArr[j])) {
                    int len = 0;
                    len = j+1;
                    System.out.println("Dfsfsfsfs   " + j);
                    System.out.println("pls" + len);
                    month += Integer.parseInt(newArr[len]);
                    System.out.println("수정 후" + year + "년" + month + "월" + day + "일");
                    if (month > 12) {
                        year++;
                        month -= 12;
//                        System.out.println(year+ "년" + month + "월");
                        period[i] = year + "." + month + "." + day;
                        System.out.println(Arrays.toString(period));

                    } else {
                        period[i] = year + "." + month + "." + day;
                        System.out.println(Arrays.toString(period));
                    }
                    Date newDate = formatter.parse(period[i]);
                    int result = date.compareTo(newDate);
                    System.out.println("리절트" + result);
                    if (result > 0) {
                        count++;
                        answer.add(i+1);
//
                    }
//                    answer[i] = i + 1;
                }

//                for (int k = 0; k < privacies.length; k++) {
//                    Date newDate = formatter.parse(period[k]);
//                    int result = date.compareTo(newDate);
//                    if (result > 0) {
//                        count++;
//                        answer = new int[count];
//                        answer[k] = k+1;
//                    }
//                }
            }
        }
        return answer;
    }
}
