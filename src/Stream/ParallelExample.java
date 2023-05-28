package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "조마루", "조다람", "귀여워",
                "람다식", "병렬"
        );

        //순차 처리
        Stream<String> stream = list.stream();
        stream.forEach(ParallelExample::print);

        //병렬 처리
        Stream<String> parallelStream = list.parallelStream();
        parallelStream.forEach(ParallelExample:: print);
    }

        public static void print(String str) {
            System.out.println(str + " : " + Thread.currentThread().getName());
        }


}
