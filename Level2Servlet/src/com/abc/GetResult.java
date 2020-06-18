package com.abc;

import java.io.IOException;
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
import javax.servlet.http.HttpSession;


@WebServlet("/GetResult")
public class GetResult extends HttpServlet {
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet res;
	private String name;
	private int m1;
	private int m2;
	private int m3;
	private HttpSession session;

	@Override
	public void init(ServletConfig config) throws ServletException {
		try {
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JuneSession", "root", "root");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String usn = req.getParameter("usn");
			session = req.getSession(true); // creating a new sesion
			String s = "select * from VtuStudent where usn=?";
			pstmt = con.prepareStatement(s);
			pstmt.setString(1, usn);
			res = pstmt.executeQuery();
			
			while(res.next()==true) {
				
				//to retrieve the data from database
				name = res.getString(2);
				m1 = res.getInt(3);
				m2 = res.getInt(4);
				m3 = res.getInt(5);
				
				//to store data to session
				session.setAttribute("name", name);
				session.setAttribute("m1", m1);
				session.setAttribute("m2", m2);
				session.setAttribute("m3", m3);
				
				//to take control to another servlet
				resp.sendRedirect("Percentage");
				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
