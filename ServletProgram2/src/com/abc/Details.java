package com.abc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Details extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		//String pwd = req.getParameter("pwd");
		PrintWriter writer = resp.getWriter();
		writer.println(name);
		//writer.println(pwd);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		//String pwd = req.getParameter("pwd");
		PrintWriter writer = resp.getWriter();
		writer.println(name);
		//writer.println(pwd);
	}
}
