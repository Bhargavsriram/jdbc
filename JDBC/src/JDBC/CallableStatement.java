package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class CallableStatement
{
	public static void main(String[] args) 
	{
		try {
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","system","bunny");
			System.out.println("Connection established successfully");
			java.sql.CallableStatement cstmt=con.prepareCall("{call insertpro(?,?,?)}");
			cstmt.setInt(1,Integer.parseInt(args[0]));
			cstmt.setString(2,args[1]);
			cstmt.setInt(3,Integer.parseInt(args[2]));
			cstmt.executeUpdate();
			System.out.println("One record inserted successfully");
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
