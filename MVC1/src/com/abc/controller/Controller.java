package com.abc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.abc.model.Model;

	@WebServlet("/Controller")
	public class Controller extends HttpServlet {
	private HttpSession session;
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String usn = req.getParameter("usn");
		session = req.getSession(true);
		try {
			Model m = new Model();
			m.setUsn(usn);
			boolean b = m.getResult();
			if(b==true) {
				session.setAttribute("name", m.getName());
				session.setAttribute("m1", m.getM1());
				session.setAttribute("m2", m.getM2());
				session.setAttribute("m3", m.getM3());
				
				resp.sendRedirect("/MVC1/success.jsp");
			}
			else {
				resp.sendRedirect("/MVC1/error.html");
			}	
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
