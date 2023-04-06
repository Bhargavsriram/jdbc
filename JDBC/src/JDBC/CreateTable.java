package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable 
{
	public static void main(String[] args) 
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","system","bunny");
			System.out.println("Connection Successfully Established");
			Statement stmt=con.createStatement();
			stmt.execute("create table student(roolno number(3),name varchar2(10),marks number(3))");
			System.out.println("Table Created Successfully");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
