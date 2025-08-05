package JDBC_Code;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Lecture_126_Fetching_all_Records {

    public static void main(String[] args) {

        String url ="jdbc:postgresql://localhost:5432/demo";
        String user = "postgres";
        String pwd = "";
        String sql ="select * from students";

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
//            rs.next();
//            String name = rs.getString("name");// We are specifying the column name from where we want to get the data.
//            System.out.println("The name of the student is : " + name);

            while (rs.next()){
                System.out.println(rs.getInt(1));
                System.out.println(rs.getString(2));
            }
            connection.close();
            System.out.println("Connection Closed");

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
