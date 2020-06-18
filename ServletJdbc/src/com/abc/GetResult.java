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

@WebServlet("/GetResult")
public class GetResult extends HttpServlet {
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet res;
	private String name;
	private int m1;
	private int m2;

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
		//String s = req.getParameter("id");
		//int id = Integer.parseInt(s);
		//Integer i1 = Integer.valueOf(s);
		
		String oldname = req.getParameter("oname");
		String newname = req.getParameter("nname");
		
		PrintWriter writer = resp.getWriter();
		try {
			//String sql = "Select * from Student where id=?";
			String sql = "Update Student set name=? where name=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, newname);
			pstmt.setString(2, oldname);
			
			int count = pstmt.executeUpdate();
			if(count==1) {
				writer.println("Data updated");
			}
			else {
				writer.println("Data not updated");
			}
			//res = pstmt.executeQuery();
			
			/*while(res.next()==true) {
				name = res.getString(2);
				m1 = res.getInt(3);
				m2 = res.getInt(4);
				writer.println("Student name is: "+name);
				writer.println("Student Marks 1 is: "+m1);
				writer.println("Student Marks 2 is: "+m2);
			}*/
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
