package com.abc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Print")
public class Print extends HttpServlet {
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Inside init()");
	}

	public void destroy() {
		System.out.println("Inside destroy()");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Inside service()");
		response.sendRedirect("PrintNext");
	}
}
