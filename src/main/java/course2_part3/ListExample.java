package course2_part3;

import java.util.ArrayList;

public class ListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(); //new <> 안에 생략가능
        list.add("apple"); // new String("apple");
        list.add("banana");
        list.add("cherry");
        list.add("banana");


        System.out.println(list.get(list.size()-1)); //마지막 요소 가리킴

        list.remove(0); //0번지 삭제
        list.set(1, "orange");//1 cherry --> orange

        for (String str : list){
            System.out.println(str);
        }
    }
}
