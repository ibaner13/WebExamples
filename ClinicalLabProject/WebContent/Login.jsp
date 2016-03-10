<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
<link href="css/Styles.css" type="text/css" rel="stylesheet">
</head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<body>
	<%@include file="Header.jsp"%>
	<div id="headings">
		<ul>
			<li><a href="">Patient</a>
			<li><a href="">Doctor</a>
			<li><a href="">Lab Tests</a>
			<li><a href="">Help</a>
		</ul>
	</div>
	<br>
	<br>
	<form>
		<table>
			<tr>
				<td>Role</td>
				<td><select>
						<option id="Administrator" value="Administrator">Administrator</option>
						<option id="Manager" value="Manager">Manager</option>
						<option id="LabTechnician" value="Lab Technician">Lab Technician</option>
						<option id="Operator" value="Operator">Operator</option>
				</select></td>
			</tr>
			<tr>
				<td>Lab Code</td>
				<td><input type="text" id="LabCode"></td>
			</tr>
			<tr>
				<td>User Name</td>
				<td><input type="text" id="UserName"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="text" id="passWord"></td>
			</tr>
		</table>
	</form>
	<%@include file="Footer.html"%>
</body>
</html>