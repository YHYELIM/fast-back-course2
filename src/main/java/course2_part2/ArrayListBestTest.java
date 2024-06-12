package course2_part2;

import model.Book;

import java.util.ArrayList;
import java.util.List;

public class ArrayListBestTest {
    public static void main(String[] args) {
        //Book 3권을 배열에 저장하고 출력
        //자바에서 제공하는 ArrayList

        List<Book> list = new ArrayList<Book>(); // 제네릭 사용 : 따로 다운캐스팅 할 필요 없음
        //ArrayList는 Book 타입만 가능
        list.add(new Book("자바",15000, "한빛", "홍길동"));
        list.add(new Book("스프링부트",14000, "한빛", "이길동"));
        list.add(new Book("플러터",13000, "한빛", "나길동"));

        Book vo = list.get(0);
        //ArrayList는 Object 타입이라 다운 캐스팅을 해줘야함
        System.out.println("책 출력 : " + vo);

        vo = list.get(1);
        System.out.println("다운캐스팅 필요없다 :" + list.get(1).toString());
        //여기선 다운캐스팅 할 필요가 없다
        //toString 생략되어있음
        //부모의 메소드(Object)가 자식의 메소드(Book)에 재정의 되기 때문에 다운캐스팅 할 필요없음

    }
}
