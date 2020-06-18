package com.abc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GetResults")
public class GetResults extends HttpServlet {
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet res;
	private String name;
	private int m1;
	private int m2;
	 
	private int m3;

	@Override
	public void init(ServletConfig config) throws ServletException {
		try {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver is loaded");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JuneSession", "root", "root");
		System.out.println("Connection Established");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			String usn = req.getParameter("usn");
			PrintWriter writer = resp.getWriter();
		try {
			String sql = "Select * from VtuStudent where usn=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, usn);
		
			res = pstmt.executeQuery();
			
			while(res.next()==true) {
				name = res.getString(2);
				m1 = res.getInt(3);
				m2 = res.getInt(4);
				m3 = res.getInt(5);
				writer.println("Student name is: "+name);
				writer.println("Student Marks 1 is: "+m1);
				writer.println("Student Marks 2 is: "+m2);
				writer.println("Student Marks 3 is: "+m3);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void destroy() {
		try {
		res.close();
		pstmt.close();
		con.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
