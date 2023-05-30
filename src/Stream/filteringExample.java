package Stream;

import java.util.Arrays;
import java.util.List;

public class filteringExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("조마루", "조다람", "조땡땡", "박마루", "빅다람", "조마루");

        names.stream()
                .distinct() //중복 제거
                .forEach(n -> System.out.println(n));
        System.out.println();

        names.stream()
                .filter(n -> n.startsWith("조")) //필터링
                .forEach(n -> System.out.println(n));
        System.out.println();

        names.stream() //중복 제거 후 필터링
                .distinct()
                .filter(n -> n.startsWith("조"))
                .forEach(n -> System.out.println(n));
    }
}
