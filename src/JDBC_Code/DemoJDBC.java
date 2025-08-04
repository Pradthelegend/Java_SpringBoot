package JDBC_Code;
import java.sql.*;

public class DemoJDBC {

    public static void main(String[] args) {

        /*
    Seven Steps to follow:

    1)import the package "import java.sql.*;"
    2)Load and Register. (this is optional java will do it for you anyways.)
    3)Create Connection.
    4)Create Statement.
    5)Execute Statement.
    6)Process the result.
    7)Close.

    */

        String url ="jdbc:postgresql://localhost:5432/demo";
        String user = "postgres";
        String pwd = "P#ssw2rd1";
        String sql ="select name from students where id = 1";

        try {
            Class.forName("org.postgresql.Driver"); // Loading and registering the driver. Its optional.
        }catch (ClassNotFoundException e){
            System.out.println("Class not found");
        }

        try {
            Connection connection = DriverManager.getConnection(url,user,pwd);
            System.out.println("Connection established");
            Statement stmnt = connection.createStatement(); //Will return a Statement object.
            ResultSet rs = stmnt.executeQuery(sql);
            rs.next();
            String name = rs.getString("name");
            System.out.println(name);
            connection.close();
            System.out.println("Connection Closed");

        }catch (Exception e){
            System.out.println(e);
        }






    }
}
