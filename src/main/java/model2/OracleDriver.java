package model2;
//OracleDriver는 Oracle 회사에서 만들어서 제공하면 된다 (Driver)
public class OracleDriver implements Connection{
    @Override
    public void getConnection(String url, String username, String password) {
        System.out.println("url, username, password 정보를 이용하여 oracleDB 접속을 시작한다.");

    }
}
