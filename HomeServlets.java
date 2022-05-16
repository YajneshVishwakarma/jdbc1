package servlets2;

import java.io.IOException;

import java.sql.*;
import java.util.*;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HomeServlets extends GenericServlet {

	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		int age = Integer.parseInt(req.getParameter("age"));
		System.out.println("ID :"+id+"\nname :"+name+"\nage :"+age);
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/form","root","root");
			PreparedStatement pstmt = con.prepareStatement("insert into form.form_details values(?,?,?)");
			
			pstmt.setInt(1,id);
			pstmt.setString(2, name);
			pstmt.setInt(3, age);
			
			pstmt.execute();
			System.out.println("\nValues Inserted!!");
			con.close();

			
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
