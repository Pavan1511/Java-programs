<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success Page</title>
</head>
<body>
<%
	session = request.getSession();
	out.println("the name is:"+session.getAttribute("name"));
	out.println("<br>");
	out.println("the m1 is:"+session.getAttribute("m1"));
	out.println("<br>");
	out.println("the m2 is:"+session.getAttribute("m2"));
	out.println("<br>");
	out.println("the m3 is:"+session.getAttribute("m3"));
	out.println("<br>");
%>
</body>
</html>