package com.abc;

import java.io.IOException;
import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;


@WebFilter(dispatcherTypes = {DispatcherType.REQUEST }
					, urlPatterns = { "/ValidationFilter" }, servletNames = { "GetResults" })
public class ValidationFilter implements Filter {

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, 
	ServletException {
		String usn = request.getParameter("usn");
		
		if(usn.length()==10) {
		chain.doFilter(request, response);
		}
		
		else {
			request.getServletContext().getRequestDispatcher("/Error.html").forward(request, response);
			((HttpServletResponse) response).sendRedirect("/FilterExmp/Error.html");
		}
	}

	
}
