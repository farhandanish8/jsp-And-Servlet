<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
out.println("SessionId "+session.getId()+"<br>");
out.println("Maxinactive "+session.getMaxInactiveInterval()+"<br>");
String username = (String)session.getAttribute("username");
session.setMaxInactiveInterval(1);
out.print("Welcome "+username);
%>
<form action ="movieServlet">
select language<select name="language">
<option value="English">English</option>
<option value="Hindi">English</option>
<option value="Tamil">English</option>
<option value="Telegu">English</option>
</select>
<input type="submit" value="Show Movies">
</form>


</body>
</html>