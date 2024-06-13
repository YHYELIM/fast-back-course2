package course2_part2;

import model.Person;
import model2.PersonFactory;

public class PersonFactoryTest {
    public static void main(String[] args) {
        PersonFactory personFactory = Person::new;
        personFactory.create("홍길동", 40);

        //함수형 인터페이스: 익명 내부 클래스 방법
        PersonFactory personFactory1 = new PersonFactory() {
            @Override
            public Person create(String name, int age) {
                return new Person(name, age);
            }
        };
        Person person = personFactory1.create("나길동",20);
        System.out.println(person);

    }
}
