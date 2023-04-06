package JDBC;

import javax.sql.rowset.JdbcRowSet;

import oracle.jdbc.rowset.OracleJDBCRowSet;

public class JRSDemo 
{
	public static void main(String[] args) 
	{
		try {
			JdbcRowSet jrs=new OracleJDBCRowSet();
			jrs.setUrl("jdbc:oracle:thin:@localhost:1521:ORCL");
			jrs.setUsername("system");
			jrs.setPassword("bunny");
			jrs.setCommand("select * from student");
			jrs.execute();
			while(jrs.next())
			{
				System.out.print(jrs.getInt(1)+"\t");
				System.out.print(jrs.getString(2)+"\t");
				System.out.println(jrs.getInt(3));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
