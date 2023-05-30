package Stream;

import java.util.Arrays;
import java.util.List;

public class streamPipeLinesExample {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("조마루", Member.male, 17),
                new Member("조다람", Member.female, 4),
                new Member("조땡땡", Member.female, 28),
                new Member("조모씨", Member.male, 30)
        );

        double ageAvg = list.stream() // 오리지널 스트림
                .filter(m -> m.getSex() == Member.male) //중간 처리 스트림
                .mapToInt(Member :: getAge) //중간 처리 스트림
                .average() // 최종 처리
                .getAsDouble();

        System.out.println("남자 평균 나이: " + ageAvg);
    }
}
