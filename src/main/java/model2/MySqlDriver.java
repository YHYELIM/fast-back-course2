package model2;

public class MySqlDriver implements Connection{
    @Override
    public void getConnection(String url, String username, String password) {
        System.out.println("url, username, password 정보를 이용하여 MySqlDB 접속을 시작한다.");
    }
}
