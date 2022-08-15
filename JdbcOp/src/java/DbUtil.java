/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author spriy
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
	public static final String DRIVER_CLASS="com.mysql.jdbc.Driver";
	public static final String DB_URL="jdbc:mysql://localhost:3306/";
	public static final String USERNAME="root";
	public static final String PASSWORD="riya@21";
	
	public static Connection getcon() throws ClassNotFoundException, SQLException {
		Class.forName(DRIVER_CLASS);
		Connection con=DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
		return con;

}
}


