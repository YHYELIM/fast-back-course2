package course2_part2;

import model2.Connection;
import model2.MySqlDriver;
import model2.OracleDriver;

public class DataBaseConnection {
    public static void main(String[] args) {
        //Oracle DB 접속
        Connection conn = new OracleDriver();
        conn.getConnection("oracle.co.kr", "system", "manager" );

        //MySql DB 접속
        Connection conn2 = new MySqlDriver();
        conn2.getConnection("mysql.co.kr", "system", "manager" );
    }
}