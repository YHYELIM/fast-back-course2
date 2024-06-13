package course2_part2;

import model2.Converter;
import model2.IntegerUtils;

public class IntegerUtilsTest {

    public static void main(String[] args) {
        //정적메소드 참조
        Converter <String,Integer> converter = IntegerUtils::stringToInt;
        int result =  converter.convert("123"); //Integer --> int //오토 언박싱
        System.out.println(result);
    }
}
