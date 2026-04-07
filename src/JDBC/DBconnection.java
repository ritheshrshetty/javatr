package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection {
    static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                      "jdbc:mysql://localhost:3306/testdb",
                      "root",
                      "ritheshrshetty156#"
            );
            System.out.println("connected succesfully");
            con.close();
        } catch (Exception e) {
            System.out.println(e);

        }
    }
}