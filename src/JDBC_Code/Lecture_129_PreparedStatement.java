package JDBC_Code;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Lecture_129_PreparedStatement {

    public static void main(String[] args) {

        String url ="jdbc:postgresql://localhost:5432/demo";
        String user = "postgres";
        String pwd = "";
        String query = "insert into students values(?,?,?)";

        int id = 5;
        String name ="Neymar";
        int marks = 92;

        try {
            Class.forName("org.postgresql.Driver"); // Loading and registering the driver. Its optional.
        }catch (ClassNotFoundException e){
            System.out.println("Class not found");
        }

        try {
            Connection connection = DriverManager.getConnection(url,user,pwd);
            System.out.println("Connection established");
            //PreparedStatement is an advanced version of Statement. It's faster,safer cause it prevents sql injection and you can also cache the query so that
            //java does not have to send the query to the database everysingke time if you're reusing the query.
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1,id);
            statement.setString(2,name);
            statement.setInt(3,marks);
            statement.execute();
            connection.close();
            System.out.println("Connection Closed");

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
