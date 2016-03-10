<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>java Server Pages</title>
</head>
<body>
<%-- Declaration --%>
<%! String title="<h1>Welcome to JSP Programming</h1>"; %>
<!-- Expression -->
<div style="text-align: center;">
<%=title %>
<%-- Implicit Object and Local Variable --%>
<%
String author="Ramesh";
out.println("<br>Designed by " + author);
%>
</div>
</body>
</html>