package com.abc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Multiplication extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String s1 = req.getParameter("num1");
		String s2 = req.getParameter("num2");
		
		int num1 = Integer.parseInt(s1);
		int num2 = Integer.parseInt(s2);
		
		int prod = num1 * num2;
		
		HttpSession session = req.getSession();
		int sum = (int) session.getAttribute("sum");
		
		
		PrintWriter writer = resp.getWriter();
		writer.println("the sum is:"+sum);
		writer.println("the product is:"+prod);
	}
}
