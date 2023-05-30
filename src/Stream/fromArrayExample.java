package Stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class fromArrayExample {
    public static void main(String[] args) {
        String[] strArray = {"조마루", "조다람", "조땡땡"};
        Stream<String> strStream = Arrays.stream(strArray);
        strStream.forEach(s -> System.out.print(s + ","));
        System.out.println();
        int[] intArray = {1,2,3};
        IntStream intStream = Arrays.stream(intArray);
        intStream.forEach(s -> System.out.print(s + ","));
        System.out.println();
    }
}
