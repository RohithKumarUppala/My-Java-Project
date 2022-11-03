package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;       
//import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class TableCreate {
	
	static final String url = "jdbc:mysql://localhost:3306/company";
	static final String user = "root";  
	static final String passwd = "5015";
	public static void main(String[] args) {
		try(Connection con=DriverManager.getConnection(url, user, passwd);
				Statement stmt=con.createStatement();)
		{
			String CREATE_TABLE="CREATE TABLE Users("+"USER_ID INT(10) NOT NULL,"+"FULLNAME VARCHAR(20) NOT NULL,"+"MOBILENO BIGINT,"+"CITY VARCHAR(20)";
			stmt.executeUpdate(CREATE_TABLE);
			System.out.println("Table Created");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
