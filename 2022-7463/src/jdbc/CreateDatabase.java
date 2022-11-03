package jdbc;
//import packages
import java.sql.Connection;
import java.sql.DriverManager;       
import java.sql.PreparedStatement;
import java.sql.SQLException;
//import java.sql.*;

public class CreateDatabase {
	//Writing Create Query in String
	private static final String Database="CREATE DATABASE BANKING";
	
	//Class.forname("com.mysql.cj.jdbc.Driver");	
	public static void main(String[] args) throws ClassNotFoundException{
		
		String url = "jdbc:mysql://localhost:3306/?useSSL=false";
		String user = "root";  
		String passwd = "5015";
		Connection con= null; //
		PreparedStatement statement = null; 
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		try {
			//Class.forname("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, user, passwd);//establishing connectivity to java database server
			statement = con.prepareStatement(Database);//interprets SQL query
			statement.executeUpdate();
			System.out.println("Database Created");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
					try {
						if(statement!=null) {
							statement.close();
						}
						if(con!=null) {
							con.close();
						}
					} catch(Exception e) {
						e.printStackTrace();
					}
			}
	}
}
