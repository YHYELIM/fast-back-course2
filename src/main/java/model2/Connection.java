package model2;

//자바에서 제공을 하는 인터페이스
//인터페이스를 구현하는 구현체는 벤더들이 만든다
public interface Connection {
    //DB 연결 동작
    public void getConnection(String url, String username, String password);



}
