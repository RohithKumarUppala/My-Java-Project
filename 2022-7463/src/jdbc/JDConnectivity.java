package jdbc;
//import packages
import java.sql.Connection;
import java.sql.DriverManager;       
import java.sql.PreparedStatement;
import java.sql.SQLException;
//import java.sql.*;

public class JDConnectivity {
	//Writing Create Query in String
	private static final String CREATE_TABLE="CREATE TABLE Customer(Customer_Id INT(10) NOT NULL,CUSTOMERNAME VARCHAR(20) NOT NULL,MOBILENO BIGINT,Address"
			+ " VARCHAR(20),BALANCE BIGINT,ACCOUNT_N0 INT,primary key(Customer_Id,ACCOUNT_N0))";
	
	//Class.forname("com.mysql.cj.jdbc.Driver");	
	public static void main(String[] args) throws ClassNotFoundException{
		
		String url = "jdbc:mysql://localhost:3306/banking?useSSl=false";//writing url from mysql"
		String user = "root";  //username of MYsql
		String passwd = "5015";//Passwd of username
		Connection con= null; //Declaration Connection
		PreparedStatement statement = null; //creating Prepared statement
		Class.forName("com.mysql.cj.jdbc.Driver");//registering driver class
		
		try {
			//Class.forname("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, user, passwd);//establishing connectivity to java database server
			statement = con.prepareStatement(CREATE_TABLE);//interprets SQL query
			statement.executeUpdate();
			System.out.println("Table Created");
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
