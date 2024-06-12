package course2_part2;

import model2.BB;
import model2.CC;

//CC를 이용하여 BB를 동작시키는 프로그래밍 (인터페이스 기반의 프로그래밍)
public class InterfaceAPI {
    public static void main(String[] args) {
        CC c = new BB();
        c.x();//BB의 x가 동작 -> 동적바인딩
        //부모 하나로 자식의 메소드를 동작시킬수있음
        c.y();
        c.z();
    }
}
