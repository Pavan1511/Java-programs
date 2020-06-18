
<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.*"%>
<html>

<body>

<%!
Connection con;
PreparedStatement pstmt;
ResultSet res;
public void jspInit(){
	
try {
	
	Class.forName("com.mysql.jdbc.Driver");
	System.out.println("Driver is loaded");
	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JuneSession", "root", "root");
	System.out.println("Connection Established");
	}
	catch (Exception e) {
		e.printStackTrace();
	}
}

%>


<%
String id1 = request.getParameter("id");
int id=Integer.parseInt(id1);
//String newname = request.getParameter("nname");


	String sql = "Select * from Student where id=?";
	//String sql = "Update Student set name=? where name=?";
	pstmt = con.prepareStatement(sql);
	pstmt.setInt(1, id);
	//pstmt.setString(2, oldname);
	
	PrintWriter pw = response.getWriter();
	res = pstmt.executeQuery();
	
	while(res.next()==true) {
		
		pw.println("Student name is: "+res.getString(2));
		pw.println("Student Marks 1 is: "+res.getInt(3));
		pw.println("Student Marks 2 is: "+res.getInt(4));
	}


%>


</html>