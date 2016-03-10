<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Headers Page</title>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<script type="text/javascript">
	function userInfo() {
		prompt("Your Session Expired.\n You are Successfully Logged out.")
	}
</script>
</head>
<body>

	<a href="Logout.jsp" onclick="userInfo()">Logout <c:out
			value="${sessionScope['loggedin'] }"></c:out>
	</a>
	<br></br>
	<c:if test="${empty sessionScope['loggedin']}">
		<c:redirect url="Login.jsp"></c:redirect>
	</c:if>

</body>
</html>