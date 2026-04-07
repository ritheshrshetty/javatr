package JDBC;

import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertData {
    static void main(String[] args) {
        try {
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/testdb",
                    "root",
                    "ritheshrshetty156#"
            );
            String query="INSERT INTO students(id,name,age) VALUES (102,'shhh',22)";

            Statement stmt=con.createStatement();

            int rows=stmt.executeUpdate(query);

            System.out.println(rows+ "rows inserted!");
            con.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
