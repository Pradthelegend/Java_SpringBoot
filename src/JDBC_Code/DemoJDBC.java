package JDBC_Code;
import java.sql.*;

public class DemoJDBC {

    public static void main(String[] args) {

        /*
    Seven Steps to follow:

    1)import the package "import java.sql.*;"
    2)Load and Register.
    3)Create Connection.
    4)Create Statement.
    5)Execute Statement.
    6)Process the result.
    7)Close.

    */

        String url ="jdbc:postgresql://localhost:5432/postgres";
        String user = "postgres";
        String pwd = "";

        try {
            Class.forName("org.postgresql.Driver"); // Loading and registering the driver. Its optional.
        }catch (ClassNotFoundException e){
            System.out.println("Class not found");
        }

        try {
            Connection connection = DriverManager.getConnection(url,user,pwd);
        }catch (Exception e){
            System.out.println("Connection Error");
        }

        System.out.println("Connection established");




    }
}
