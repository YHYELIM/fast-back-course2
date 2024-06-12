import com.google.gson.Gson;
import model.Person;

public class GsonToAPI {
    public static void main(String[] args) {
        Person person = new Person("John" , 30); //객체 생성

        //json으로 보내면 json 받는 쪽에서 해당 객체로 바꾸는 api가 있을것임
        Gson gson = new Gson();
        String json = gson.toJson(person);
        System.out.println(json);
        //객체를 json 형식으로 바뀜
    }
}
