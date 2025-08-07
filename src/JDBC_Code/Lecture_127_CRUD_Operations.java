package JDBC_Code;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Lecture_127_CRUD_Operations {

    public static void main(String[] args) {

        String url ="jdbc:postgresql://localhost:5432/demo";
        String user = "postgres";
        String pwd = "";
        String sql ="INSERT INTO students (name,marks) VALUES ('Bro', 99)";

        try {
            Class.forName("org.postgresql.Driver"); // Loading and registering the driver. Its optional.
        }catch (ClassNotFoundException e){
            System.out.println("Class not found");
        }

        try {
            Connection connection = DriverManager.getConnection(url,user,pwd);
            System.out.println("Connection established");
            Statement stmnt = connection.createStatement(); //Will return a Statement object.
            boolean status = stmnt.execute(sql);
            System.out.println(status);
            connection.close();
            System.out.println("Connection Closed");

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
