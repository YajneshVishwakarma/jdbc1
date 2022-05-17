package com.alvas.jdbc;

import java.util.*;
import java.sql.*;

public class Insert {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
		Statement stmt = con.createStatement();
		
//		Scanner scan = new Scanner(System.in);
//		int i = 1;
//		while(i!=3)
//		{
//			System.out.println("Enter name, email, phone no.");
//			String name = scan.next();
//			String mail = scan.next();
//			String phone = scan.next();
//			stmt.execute("insert into student_details values("+i+",'"+name+"','"+mail+"','"+phone+"')");
//			i++;
//			System.out.println("added");
//		}
		
//		stmt.execute("insert into student values(111,'Zoro','Zoro@gmail.com','9933993939')");
		for( int i = 111; i<121;i++)
			stmt.execute("insert into student_details values("+i+",'Zoro"+i+"','Zoro"+i+"@gmail.com','9933993939')");
		stmt.close();
		con.close();
	}
}
