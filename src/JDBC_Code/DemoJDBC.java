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

        try {
            Class.forName("org.postgresql.Driver");
        }catch (ClassNotFoundException e){
            System.out.println("Class not found");
        }

    }
}
