<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Customer</title>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
</head>
<body>
	<header><%@include file="Header.jsp"%></header>
	<section>
		<form action="ProcessCustomer.jsp">
			<label>Customer Id</label> <input type="text" name="customerId">
			<label>Customer Name</label> <input type="text" name="customerName">
			<label>Email</label> <input type="email" name="email"> <label>Hand
				Phone</label> <input type="text" name="handPhone" pattern="9999999999"
				placeholder="Phone Number"> <input type="submit" value="Add">
		</form>
	</section>
	<footer><jsp:include page="Footer.jsp"></jsp:include></footer>
</body>
</html>