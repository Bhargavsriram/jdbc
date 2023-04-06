package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

public class SavaPointDemo
{
	public static void main(String[] args) 
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","system","bunny");
			con.setAutoCommit(false);
			Statement stmt=con.createStatement();
			stmt.executeUpdate("insert into student values(2,'Bunny',90)");
			Savepoint s=con.setSavepoint();
			stmt.executeUpdate("update student set marks=40 where roolno=1");
			con.rollback(s);
			stmt.executeUpdate("delete from student where roolno=1");
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
