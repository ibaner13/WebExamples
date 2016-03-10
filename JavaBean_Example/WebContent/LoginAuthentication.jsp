<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Authentication Page</title>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
</head>
<body>
	<c:import url="Headers.jsp"></c:import>
	<c:if
		test="${param.userName eq 'ravi'} && ${param.passWord eq 'password'}"
		scope="session" var="text">
Welcome : <c:out value="${param.userName}"></c:out>
		<c:set var="loggedin" value="logged" scope="session"></c:set>
	</c:if>
	<c:if
		test="${!param.userName eq 'ravi'} || ${!param.passWord eq 'password'}"
		scope="session" var="text">
		<c:redirect url="index.jsp"></c:redirect>
	</c:if>
</body>
</html>