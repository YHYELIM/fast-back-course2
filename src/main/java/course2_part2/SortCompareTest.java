package course2_part2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//특정 객체 인스턴스 메소드 참조
public class SortCompareTest {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("홍길동", "김길동", "이길동");
        Collections.sort(names, String::compareTo); //특정 객체의 메서드 참조
        System.out.println(names);
    }
}
