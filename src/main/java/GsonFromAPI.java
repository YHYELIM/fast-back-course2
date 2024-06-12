import com.google.gson.Gson;
import model.Person;

public class GsonFromAPI {
    public static void main(String[] args) {
        String json = "{\"name\":\"John\",\"age\":30}";//JSon객체

        //Json -> Person
        Gson gson = new Gson();
        Person p = gson.fromJson(json, Person.class); //json 문자열, 변환할 자바 객체 (클래스)=타입 넣어주기
        System.out.println(p.getName()); //John
        System.out.println(p.getAge()); //30
        System.out.println(p.toString());

    }
}
