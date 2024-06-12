package course2_part2;

import model.Book;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        //Book 3권을 배열에 저장하고 출력
        //자바에서 제공하는 ArrayList
        ArrayList list = new ArrayList(); // 기본 크기(10)
        list.add(new Book("자바",15000, "한빛", "홍길동"));
        list.add(new Book("스프링부트",14000, "한빛", "이길동"));
        list.add(new Book("플러터",13000, "한빛", "나길동"));

        Book vo = (Book) list.get(0);
        //ArrayList는 Object 타입이라 다운 캐스팅을 해줘야함
        System.out.println("책 출력 : " + vo);

        System.out.println("다운캐스팅 필요없다 :" + list.get(0));
        //여기선 다운캐스팅 할 필요가 없다
        //toString 생략되어있음
        //부모의 메소드(Object)가 자식의 메소드(Book)에 재정의 되기 때문에 다운캐스팅 할 필요없음

    }
}
