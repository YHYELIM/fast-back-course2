package course2_part3;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {

    public static void main(String[] args) {
        String str = "Hello, World";
        Map<Character, Integer> charCountMap = new HashMap<>();
        char[] strArray = str.toCharArray(); // {'H', 'e', 'l', 'l', 'o', ',', ' ', 'W', 'o', 'r', 'l', 'd'}

        for (char c : strArray) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
