<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring MVC</title>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
</head>
<body>
	<b>One Book with following details added</b>
	<ol>
		<li>${bookObj.bookNumber}</li>
		<li>${bookObj.bookName}</li>
	</ol>
</body>
</html>