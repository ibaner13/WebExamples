<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Administrator</title>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
</head>
<body>
	<form:form method="post" action="LoginForm">
		<br>
		<br>
		<hr>
		<label>Username : </label>
		<br>
		<form:input path="userName" />
		<br>
		<br>
		<label>Password : </label>
		<br>
		<form:password path="passWord" />
		<br>
		<br>
		<hr>
		<input type="submit" value="ADD">
	</form:form>
</body>
</html>