<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Formatting Tag</title>
</head>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<body>
  <fmt:setBundle basename="MessageResource_fr" var="msg"/>
  
  <form action="">
    <label><fmt:message bundle="${msg}" key="forms.label.userName"></fmt:message> </label> : <input><br/><br/>
    
    <label><fmt:message bundle="${msg}" key="forms.label.passWord"></fmt:message> </label>: <input>
  </form>
</body>
</html>