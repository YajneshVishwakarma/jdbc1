package com.alvas.jdbc;
import java.sql.*;
import java.util.*;

public class Select {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
		
		Statement stmt = con.createStatement();
		ResultSet res = stmt.executeQuery("select*from student_details");
		
		ResultSetMetaData resmeta = res.getMetaData();
		
		int count = resmeta.getColumnCount();
		
		for(int i = 1; i<=count;i++)
		{
			System.out.print(resmeta.getColumnName(i)+" ");
		}
		System.out.println();
		
		while(res.next())
		{
			System.out.println(res.getInt(1)+" "+res.getString(2)+" "+res.getString(3)+" "+res.getString(4));
		}
		
		
		
		stmt.close();
		con.close();
	}
}
