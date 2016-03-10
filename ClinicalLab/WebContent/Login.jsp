<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
<link href="css/Styles.css" type="text/css" rel="stylesheet">
</head>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<body>
	<fmt:setBundle basename="MessageResource_fr" var="msg" />
	<%@include file="Header.html"%>
	<br>
	<div id='div1'>
		<ul>
			<li><a href="">Patient</a></li>
			<li><a href="">Doctor</a></li>
			<li><a href="">Lab Tests</a></li>
			<li><a href="">Help</a></li>
		</ul>

	</div>
	<br>
	<br>
	<div>
		<form>
			<table>
				<tr>
					<td>Role</td>
					<td><select><option id="Administrator"
								value="Administrator">Administrator</option>
							<option id="Manager" value="Manager">Manager</option>
							<option id="labTechnicians" value="Lab Technicians">Lab
								Technicians</option>
							<option id="Operators" value="Operators">Operators</option>
					</select></td>
				<tr>
					<td>Lab Code</td>
					<td><input type="text" id="labCode"></td>
				</tr>
				<tr>
					<td>User Name</td>
					<td><input type="text" id="userName"></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="text" id="passWord"></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="Login"></td>
				</tr>
			</table>
		</form>
		<br>
		<br>
	</div>
	<%@include file="Footer.html"%>
</body>
</html>