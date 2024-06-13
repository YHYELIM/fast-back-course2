package course2_part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapStreamExample2 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana","cherry", "orange");
        List<String> upperCase = words.stream()
                .map(word->word.toUpperCase())
                .collect(Collectors.toList());

        System.out.println("upperCase = " +upperCase);
        for (String str : upperCase){
            System.out.println(str);

        }
    }
}
