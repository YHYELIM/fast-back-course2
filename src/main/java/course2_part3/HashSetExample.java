package course2_part3;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple");

        System.out.println(set.size());//3

        set.remove("Banana");
        for (String element : set){
            System.out.println(element);
        }

        boolean contains = set.contains("Cherry");

        System.out.println("Set contains Cherry? " + contains);

        set.clear();  //비움

        boolean empty = set.isEmpty();
        System.out.println("Set is empty? " + empty);

    }
}