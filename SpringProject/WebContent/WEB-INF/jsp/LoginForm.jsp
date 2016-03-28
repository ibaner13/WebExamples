<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
</head>
<body>
<body>
	<form:form method="post" action="Success">
		<br>
		<br>
		<hr>
		<label>Student Id : </label>
		<br>
		<form:input path="studId" />
		<br>
		<br>
		<label>Student name : </label>
		<br>
		<form:input path="studName" />
		<br>
		<br>
		<label>Student email : </label>
		<br>
		<form:input path="studEmail" />
		<br>
		<br>
		<label>Student department : </label>
		<br>
		<form:select path="studDept" items="${dptmnts}" />
		<br>
		<br>
		<label>Academic scores : </label>
		<br>
		<form:input path="acadScores" />
		<br>
		<br>
		<label>Academic Events : </label>
		<br>
		<form:input path="acadEvents" />
		<br>
		<br>
		<label>Sports Activities : </label>
		<br>
		<form:input path="sportsActiv" />
		<br>
		<br>
		<label>Cultural Activities : </label>
		<br>
		<form:input path="culturalActiv" />
		<br>
		<br>
		<hr>
		<input type="submit" value="ADD">
	</form:form>
</body>
</html>