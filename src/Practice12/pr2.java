package Practice12;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class pr2 {
    public static void main(String[] args) {
        System.out.println(pr2.solution("Zbcdefg"));
    }
    public static String solution(String s) {

        return Stream.of(s.split(""))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining());
    }
}
