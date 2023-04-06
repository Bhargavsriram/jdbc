package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertingValues
{
	public static void main(String[] args)
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","system","bunny");
			System.out.println("Connection Established Successfully");
			Statement stmt=con.createStatement();
			stmt.executeUpdate("insert into student values(1,'Bhargav',63)");
			System.out.println("One record is inserted successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
