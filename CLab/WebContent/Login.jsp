<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>




<link href="css/Styles.css" type="text/css" rel="stylesheet">
</head>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<body>


<c:if test="${param['locale'] != null }">
<fmt:setLocale value="${param['locale']}" scope="session"/>
</c:if>
<div align="right" id="country">
<a href="Login.jsp?locale=fr"><img src="images/french.png"/></a>
<a href="Login.jsp?locale=in"><img src="images/india.gif"/></a>
<a href="Login.jsp?locale=sp"><img src="images/spain.gif"/></a>
</div>
<fmt:setBundle basename="MessageResource" var="msg" />

<%@include file="Header.html" %>
<br>
<div id='div1'>
<ul>
<li><a href="">Patient</a></li>
<li><a href="">Doctor</a></li>
<li><a href="">Lab Tests</a></li>
<li><a href="">Help</a></li>
</ul>

</div>
<br><br>
<div>

<form action="TestOrder.jsp" method="post" >
<table>

<tr><td><label><fmt:message bundle="${msg}" key="forms.label.role"></fmt:message></label></td><td><select><option id="Administrator" value="Administrator">Administrator</option>
<option id="Manager" value="Manager">Manager</option>
<option id="labTechnicians" value="Lab Technicians">Lab Technicians</option>
<option id="Operators" value="Operators">Operators</option>
</select></td>
<tr><td><label><fmt:message bundle="${msg}" key="forms.label.Code"></fmt:message></label></td><td>
			<input type="text" name="labCode" id="labCode" list="jSonList" placeholder="CITY" >
			<datalist id = "jSonList"></datalist>
		</td> </tr>
<tr><td><label><fmt:message bundle="${msg}" key="forms.label.userName"></fmt:message></label></td><td><input type="text" id="userName"></td></tr>
<tr><td><label><fmt:message bundle="${msg}" key="forms.label.passWord"></fmt:message></label></td><td><input type="text" id="passWord"></td></tr>
<tr><td colspan="2"><input type="submit" value="<fmt:message bundle="${msg}" key="forms.label.submit" ></fmt:message>"></td></tr>
</table>

</form>
<br><br>
</div>
<%@include file="Footer.html" %>

<script >
	var dataList = document.getElementById("jSonList");
	var input = document.getElementById("labCode");
	var request=false;

	if(window.XMLHttpRequest)
		{
		request=new XMLHttpRequest();
		}
	else if(window.ActiveXObject)
		{
		request=new ActiveXObject("Microsoft.XMLHTTP");
		} 
	request.open("GET","DATA/clinic.json",true);
	request.onreadystatechange = function (response) {
		if(request.readyState === 4 && request.status === 200){
			var jSonOptions = JSON.parse(request.responseText);
			jSonOptions.forEach(function(item){
				var option = document.createElement("option");
				option.value = item.code;
				dataList.appendChild(option);
			});
		}
		
	};
	request.send(); 
</script>

</body>
</html>