package com.alvas.jdbc;

import java.sql.*;
import java.lang.*;
import java.util.*;

public class Update {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
		Statement stmt = con.createStatement();
		
		stmt.execute("update student_details set name = 'zoro1' where id = 1");
		stmt.execute("update student_details set email = 'zoro1@gmail.com' where id = 1");
		stmt.execute("update student_details set phone = '9989895383' where id = 1");
		
		System.out.println("Enter the value you want to change\n1.name\n2.email\n3.phone");
		Scanner scan = new Scanner(System.in);
		int key =  scan.nextInt();
		switch (key) {
		case 1:
			System.out.println("Enter your name");
			String name =  scan.next();
			System.out.println("Enter the id");
			int id = scan.nextInt();
			stmt.execute("update student_details set name = '"+name+"' where id = "+id);
			break;
		case 2:
			System.out.println("Enter your email");
			String email =  scan.next();
			System.out.println("Enter the id");
			id = scan.nextInt();
			stmt.execute("update student_details set email = '"+email+"' where id = "+id);
			break;
		case 3:
			System.out.println("Enter your phone");
			String phone =  scan.next();
			System.out.println("Enter the id");
			id = scan.nextInt();
			stmt.execute("update student_details set phone = '"+phone+"' where id ="+id);
			break;
		default:
			break;
		}
		stmt.close();
		con.close();
		
	}
}
