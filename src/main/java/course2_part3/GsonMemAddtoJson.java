package course2_part3;

import com.google.gson.Gson;
import model3.Address;
import model3.Person;

public class GsonMemAddtoJson {
    public static void main(String[] args) {
        Address address = new Address("서울", "대한민국");

        Person member = new Person("홍길동", 30, "bit@email.com",address);

        //Person-->Json
        Gson gson = new Gson();
        String json = gson.toJson(member);
        System.out.println("Json : " + json);
    }
}
