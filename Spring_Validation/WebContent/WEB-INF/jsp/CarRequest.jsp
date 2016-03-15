<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Car Request</title>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
</head>
<body>
	<h2>Request Car</h2>
	<form:form method="post" action="AddRequest">
		<form:errors cssStyle="color:red" path="*" />
		<br>
		<br>
		<hr>
		<label>Name :</label>
		<br>
		<form:input path="name" />
		<br>
		<br>
		<label>Mobile Number :</label>
		<br>
		<form:input path="mobileNumber" />
		<br>
		<br>
		<label>Email :</label>
		<br>
		<form:input path="email" />
		<br>
		<br>
		<label>Car Type :</label>
		<br>
		<form:select path="type" items="${carType}" />
		<br>
		<br>
		<hr>
		<input type="submit" value="ADD">
	</form:form>
</body>
</html>
