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
        String insertSqlQuery = "INSERT INTO students (name,marks) VALUES ('Charles', 79)";
        String upadteQuery = "update students set name='Max' where id=5";
        String deleteQuery = "delete from students where id=7";

        try {
            Class.forName("org.postgresql.Driver"); // Loading and registering the driver. Its optional.
        }catch (ClassNotFoundException e){
            System.out.println("Class not found");
        }

        try {
            Connection connection = DriverManager.getConnection(url,user,pwd);
            System.out.println("Connection established");
            Statement statement = connection.createStatement(); //Will return a Statement object.
//            statement.execute(insertSqlQuery);//You can use execute() when inserting,deleting etc. Use executeQuery() only when you are pulling data from the database.
            //statement.execute(upadteQuery);
            statement.execute(deleteQuery);
            connection.close();
            System.out.println("Connection Closed");

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
