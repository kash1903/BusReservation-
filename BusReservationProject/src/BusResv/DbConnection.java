package BusResv;

import java.sql.*;

public class DbConnection {
	
	private static final String url="jdbc:mysql://localhost:3306/BusResv";
	private static final String userName="root";
	private static final String passWord = "root@123";
	
	
	public static  Connection getConnection() throws SQLException{
		return DriverManager.getConnection(url,userName,passWord);
		
		
	}
	

}
