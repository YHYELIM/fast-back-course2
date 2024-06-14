package course2_part3;

import com.google.gson.Gson;
import model3.Member;

public class GsonToJson {
    public static void main(String[] args) {
        Member mvo = new Member("홍길동", 30, "bit@email.com");

        //객체 생성
        Gson gson = new Gson();
       String json = gson.toJson(mvo);
        System.out.println("json = " +json);


    }
}
