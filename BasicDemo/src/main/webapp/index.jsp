<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action ="register">
name:<input type ="text" name="employeeName"><br>
city:<input type ="text" name="city"><br>
salary:<input type ="text" name="salary"><br>
mobile:<input type ="text" name="mobile"><br>

<select name="course">
<option value="Java">java</option>
<option value="Spring">spring</option>
<option value="Html">html</option> 
</select>
<br>


<select name="hobbies">
<input type="checkbox"name="hobbies" values="sports">
<input type="checkbox"name="hobbies"values=",music">
<input type="checkbox"name="hobbies"values="dance">
<input type="checkbox"name="hobbies"values="travel">
</select>
<input type ="submit" value="submit">
</form>
</body>
</html>