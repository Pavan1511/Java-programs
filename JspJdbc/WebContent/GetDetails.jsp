<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%!
		Connection con;
		PreparedStatement pstmt;
		ResultSet res;
		Statement stmt;
		public void jspInit(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JuneSession", "root", "root");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		}
	%>
	<%
		//String empname = request.getParameter("empname");
		String s1 = request.getParameter("empid");
		int empid = Integer.parseInt(s1);
		String s = "Delete from Employeee where empid=?";
		pstmt = con.prepareStatement(s);
		//pstmt.setString(1, empname);
		pstmt.setInt(1, empid);
		
		int x = pstmt.executeUpdate();
		if(x>0){
			out.println("The data is updated");
			out.println("<br>");
			out.println("<br>");
		}
		else{
			out.println("The data is not updated");
			out.println("<br>");
			out.println("<br>");
		}
		
		String s2="Select * from Employeee";
		stmt = con.createStatement();
		res = stmt.executeQuery(s2);
		while(res.next()==true){
			out.println("the ID of the employee is: "+res.getInt(1));
			out.println("<br>");
			out.println("the name of the employee is: "+res.getString(2));
			out.println("<br>");
			out.println("the age of the employee is: "+res.getInt(3));
			out.println("<br>");
			out.println("the salary of the employee is: "+res.getInt(4));
			out.println("<br>");
			out.println("the experience of the employee is: "+res.getInt(5));
			out.println("<br>");
			out.println("----------------------------------------------");
			out.println("<br>");
		}
		
		
	%>
</body>
</html>