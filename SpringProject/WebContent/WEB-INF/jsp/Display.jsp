<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Toppers List Display</title>
</head>
<body>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
	<h3>Student List</h3>

	<table border="1" cellspacing="0">
		<tr>
			<th><label>Student Roll</label></th>
			<th><label>Students Name</label></th>
			<th><label>Students Email</label></th>
			<th><label>Student Department</label></th>
			<th><label>Academic marks</label></th>
			<th><label>Academic events</label></th>
			<th><label>Sports events</label></th>
			<th><label>Cultural events</label></th>
			<th><label>Grade</label></th>
		</tr>
		<c:forEach items="${student}" var="student">
			<tr>
				<td>${student.studId }</td>
				<td>${student.studName }</td>
				<td>${student.studEmail }</td>
				<td>${student.studDept }</td>
				<td>${student.acadScores }</td>
				<td>${student.acadEvents }</td>
				<td>${student.sportsActiv }</td>
				<td>${student.culturalActiv }</td>
				<td>${student.total }</td>
		</c:forEach>
	</table>

</body>
</html>