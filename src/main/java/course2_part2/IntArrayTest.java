package course2_part2;

import model.IntArray;

public class IntArrayTest {
    public static void main(String[] args) {
        //정수 5개를 배열에 저장하고 출력
        //배열의 길이를 가변적으로 만들어줘야함
        IntArray list = new IntArray();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);


        for (int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
