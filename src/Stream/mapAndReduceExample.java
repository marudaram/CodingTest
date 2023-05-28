package Stream;

import java.util.Arrays;
import java.util.List;

public class mapAndReduceExample {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("조마루", 30),
                new Student("조다람", 20),
                new Student("조땡땡", 10)
        );

        double avg = studentList.stream()
                .mapToInt(Student :: getScore) // 중간처리(학생 객체를 점수로 매핑)
                .average() // 최종처리(평균 점수)
                .getAsDouble();

        System.out.println("평균 점수: " + avg);
    }
}
