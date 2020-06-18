package com.abc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Percentage")
public class Percentage extends HttpServlet {
	private HttpSession session;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		session = req.getSession(); //use the existing session
		
		//retrieving the data from session
		String name = (String) session.getAttribute("name");
		int m1 = (Integer) session.getAttribute("m1");
		int m2 = (Integer) session.getAttribute("m2");
		int m3 = (Integer) session.getAttribute("m3");
		
		//calculate the percentage
		float percentage=((m1+m2+m3)/300.0f)*100.0f;
		
		//Print the data to the browser
		PrintWriter writer = resp.getWriter();
		writer.println("The candidate name:"+name);
		writer.println("The candidate m1:"+m1);
		writer.println("The candidate m2:"+m2);
		writer.println("The candidate m3:"+m3);
		writer.println("The candidate percentage:"+percentage);
		
		session.invalidate();
		
	}
}
