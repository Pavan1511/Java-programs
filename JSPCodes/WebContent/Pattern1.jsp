<%@page import="java.util.Date"%>

<html>
<body>
<jsp:include page="Html1.html"></jsp:include>
<br>
The date & Time is: <%= new Date() %>
<br>
<jsp:include page="Html2.html"></jsp:include>
<jsp:include page="Jsp1.jsp"></jsp:include>
</body>
</html>