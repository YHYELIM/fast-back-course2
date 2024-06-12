package course2_part2;

import model.Book;
import model.BookArray;

public class MyBookArrayTest {
    //책 3권의 데이터를 배열에 저장하고 출력
    public static void main(String[] args) {
        BookArray list = new BookArray();
        list.add(new Book("자바",15000, "한빛", "홍길동"));
        list.add(new Book("스프링부트",14000, "한빛", "이길동"));
        list.add(new Book("플러터",13000, "한빛", "나길동"));

        Book vo = list.get(0);
        System.out.println("책 출력 : " + vo);
    }

}
