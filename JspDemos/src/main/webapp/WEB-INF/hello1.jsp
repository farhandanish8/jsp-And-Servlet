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
pageContext.setAttribute("message","welcome");
request.setAttribute("message","Good Day in request");
session.setAttribute("message","Good Day in session");
application.setAttribute("message","Good Day in application");
%>
<h1>Using Scripting</h1>
<%
String msg1 = (String)request.getAttribute("message");
String msg2 = (String)session.getAttribute("message");
String msg3 = (String)application.getAttribute("message");
%>
<%=msg1 %><br>
<%=msg2 %><br>
<%=msg3 %><br>
</body>
</html>