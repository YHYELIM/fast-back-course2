package course2_part3;

import com.google.gson.Gson;
import model3.Member;

public class GsonFromJson {
    public static void main(String[] args) {
        //다른 시스템에서 받은 json을 자바 객체로 바꾸기
        String json = "{\"name\":\"홍길동\",\"age\":30,\"email\":\"bit@email.com\"}";

        Gson gson = new Gson();//gson 객체 생성
        Member mvo =  gson.fromJson(json, Member.class); //gson에 있는 메서드 사용

        System.out.println("mvo = " + mvo);

        System.out.println(mvo.getAge());
        System.out.println(mvo.getName());
        System.out.println(mvo.getEmail());

    }
}
