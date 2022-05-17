package com.alvas.jdbc;

import java.sql.*;
import java.util.*;

public class Delete {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
		Statement stmt = con.createStatement();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the primary key which you want to delete");
		int id = scan.nextInt();
		
		stmt.execute("delete from student_details where id = "+id);
		stmt.close();
		con.close();
	}
}
