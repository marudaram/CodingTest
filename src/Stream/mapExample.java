package Stream;

import java.util.Arrays;
import java.util.List;

public class mapExample {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("조마루", 100),
                new Student("조다람", 90),
                new Student("조땡땡", 80)
        );

        studentList.stream()
                .mapToInt(Student :: getScore) //학생 객체를 점수로 매핑하는 작업
                .forEach(score -> System.out.println(score)); //반복자를 통해 출력한다
    }
}
