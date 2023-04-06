package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TMDemo
{
	public static void main(String[] args) 
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","system","bunny");
			con.setAutoCommit(false);
			Statement stmt=con.createStatement();
			stmt.executeUpdate("insert into student values(3,'Sriram',95)");
			con.commit();
			stmt.executeUpdate("update student set marks=40 where roolno=1");
			con.rollback();
			stmt.executeUpdate("delete from student where roolno=2");
			con.commit();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
