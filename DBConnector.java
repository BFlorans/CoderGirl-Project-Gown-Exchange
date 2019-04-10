package Servlet;
import java.sql.*;
public class DBConnector {
    public static void main(String[] args) {
        try {

            //1. get a connection
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gown-exchange", "gown", "apples");
            //2. create a statement
            Statement myStat = myConn.createStatement();
            //3. execute query
            ResultSet myRs = myStat.executeQuery("select * from gown-exchange");
            //4. process result
            while (myRs.next()) {
                System.out.println(myRs.getString("color") + " " + myRs.getString("location"));
            }
            //3. a different way...
            String sql = "insert into gowns(....)";
            myStat.executeUpdate(sql);
            System.out.println("Insert Complete.");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
