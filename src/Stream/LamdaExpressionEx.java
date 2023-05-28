package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LamdaExpressionEx {

    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("조마루", 100),
                new Student("조다람", 90)
        );

        Stream<Student> stream = list.stream(); // 스트림 얻기
        stream.forEach( s -> {
            String name = s.getName();
            int score = s.getScore();
            System.out.println(name + "-" + score);
        });
    }
}
