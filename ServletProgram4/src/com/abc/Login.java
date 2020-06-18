package com.abc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet{
	private static int count=3;
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String mypwd="123abc";
		
		String uname = req.getParameter("uname");
		String pwd = req.getParameter("pwd");
		resp.setContentType("text/html");
		
		if(pwd.equals(mypwd)) {
			//RequestDispatcher reqd = req.getRequestDispatcher("callhome");
			//reqd.forward(req, resp);
			resp.sendRedirect("callhome");
		}
		else {
			PrintWriter writer = resp.getWriter();
			writer.println("invalid password!!");
			count--;
			writer.println("the remaining attempts are:"+count);
			
			if(count>0) {
				RequestDispatcher reqd = req.getRequestDispatcher("/Welcome.html");
				reqd.include(req, resp);
			}
		}
	}
}
