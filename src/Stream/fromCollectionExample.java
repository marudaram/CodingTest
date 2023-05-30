package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class fromCollectionExample {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("조마루", 100),
                new Student("조다람", 90),
                new Student("조땡땡", 80)
        );

        Stream<Student> stream = studentList.stream();
        stream.forEach(s -> System.out.println(s.getName()));
    }
}
