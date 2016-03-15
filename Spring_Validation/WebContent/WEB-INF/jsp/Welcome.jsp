<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success Page</title>
</head>
<body>
	<b>One Book With Following Details Added</b>
	<ul>
		<li>Name : ${command.name}</li>
		<li>Mobile Number : ${command.mobileNumber}</li>
		<li>Email : ${command.email}</li>
		<li>Car Type: ${command.type}</li>
	</ul>
	<hr>
	<br>
	<form action="cust/check">
		<label>ReEnter Name :</label> <br> <input type="text" name="name" />
		<input type="submit" value="Get Previous Booking">
	</form>
	<hr>
	<p>Previous Booking :</p>
	${prevBooking}
</body>
</html>