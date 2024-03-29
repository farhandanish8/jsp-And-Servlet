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
request.setAttribute("message","Good Day in request");
session.setAttribute("message","Great Day in session");
application.setAttribute("message","Fun Day in application ");
%>
</body>
</html>


