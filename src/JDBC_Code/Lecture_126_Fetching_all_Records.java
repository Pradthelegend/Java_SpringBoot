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
                System.out.print(rs.getInt(1) + " | ");//getInt(1) means get the value in column 1 of the current row as an int.
                                           //You can also use column names, like getInt("id") — this means get the value of the column named "id" in the current row.
                System.out.print(rs.getString(2) + " | ");//getString(2) means get the value in column 2 of the current row as a String.
                System.out.print(rs.getInt(3));
                System.out.println();
            }
            connection.close();
            System.out.println("Connection Closed");

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
