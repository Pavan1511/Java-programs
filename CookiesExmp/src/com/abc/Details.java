package com.abc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Details extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String pwd = request.getParameter("pwd");
		
		Cookie c1 = new Cookie("name", name);
		Cookie c2 = new Cookie("age", age);
		Cookie c3 = new Cookie("pwd", pwd);
		
		response.addCookie(c1);
		response.addCookie(c2);
		response.addCookie(c3);
		
		
		PrintWriter writer = response.getWriter();
		writer.println("cookies added");
		writer.println(name);
		writer.println(age);
	}

}
