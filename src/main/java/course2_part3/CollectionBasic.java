package course2_part3;

import java.util.ArrayList;

public class CollectionBasic {
    public static void main(String[] args) {
        //arrayList 에 10,20,30,40,50 5개의 정수 (int) 저장하고 출력
        //arrayLIst -> object[] <--- Integer(Wrapper)   (int 불가)
        //근데 int 가능 --> 오토박싱 때문

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10); //오토박싱됨
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        //오토언박싱
        for (int data : list){
            System.out.println(data);
        }



    }
}
