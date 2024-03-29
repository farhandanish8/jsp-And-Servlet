<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action ="employeeServlet">
name:<input type ="text" name="employeeName"><br>
employeeId<input type ="text" name = "employeeId"><br>
city:<input type ="text" name="city"><br>
salary:<input type ="text" name="salary"><br>

<select name="course">
<option value="Java">java</option>
<option value="Spring">spring</option>
<option value="Html">html</option> 
</select>
<input type ="submit" value="submit">
<br>


</body>
</html>