package com.abc;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Addition extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String s1 = req.getParameter("num1");
		String s2 = req.getParameter("num2");
		
		int num1 = Integer.parseInt(s1);
		int num2 = Integer.parseInt(s2);
		
		int sum = num1 + num2;
		System.out.println("The sum is :"+sum);
		
		HttpSession session = req.getSession(true);
		System.out.println(session);
		session.setAttribute("sum", sum);
		
		RequestDispatcher reqd = req.getRequestDispatcher("call1");
		reqd.forward(req, resp);
	}
}
