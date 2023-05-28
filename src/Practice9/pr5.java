package Practice9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class pr5 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("조마루", "조다람", "귀여워");
        Stream<String> stream = list.stream();
        stream.forEach(name -> System.out.println(name));

    }
}
