package IdGen;

import java.sql.*;

public class dbconfig {

    public static Connection getConnection() throws ClassNotFoundException, SQLException{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/id","root","");


            return con;
    }
}
