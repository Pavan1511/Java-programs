package com.abc;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Validation")
public class Validation extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String usn = req.getParameter("usn");
		
		if(usn.length()!=10) {
			resp.sendRedirect("/ServletExmpChain/Error.html");
		}
		else {
			RequestDispatcher reqd = req.getRequestDispatcher("GetResults");
			reqd.forward(req, resp);
		}
	}
}

