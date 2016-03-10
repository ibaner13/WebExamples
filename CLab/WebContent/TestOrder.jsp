<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
  <script src="//code.jquery.com/jquery-1.10.2.js"></script>
  <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script>
  $(function() {
    $( "#datepicker" ).datepicker();
  });
  
 </script> 
  
      
<link href="css/Styles.css" type="text/css" rel="stylesheet">
<script type="text/javascript" src="script/first.js"></script>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
</head>
<body>
<%@include file="Header.html" %>
<div>
<c:out value="${param.username }"></c:out>
<c:out value="${param.labcode }"></c:out>
</div>
<div id="div1">
   <ul>
  <li><a href="#"> Create Test Order</a> </li>
  <li><a href="#"> Add Test Result </a></li>
  <li><a href="#"> View Test Report </a></li>
</ul>

</div>

<form action="">
<div>
  <table border="1">
     <tr>
       <td>Order Number</td>
       <td><input type="text"></td>
       <td>Date</td>
       <td><input type="text" id="datepicker"></td>
       <td>Type</td>
       <td><input type="radio" name="collection_type">Lab
           <input type="radio" name="collection_type">Home</td>
     </tr> 
     <tr>
       <td>Patient Code</td>
       <td><input type="text"></td>
       <td>Patient Name</td>
       <td><input type="text"></td>
       <td>Age</td>
       <td><input type="text"></td>
     </tr>
     <tr>
       <td>HandPhone</td>
       <td><input type="number"></td>
       <td>E-mail</td>
       <td><input type="email"></td>
       <td>Gender</td>
       <td><input type="radio" name="gender">Male
           <input type="radio" name="gender">Female</td>
     </tr>
     <tr>
       <td>Doctor Code</td>
       <td><input type="text" id="dcode" ></td>
      
       <td colspan="2">Doctor Name</td>
       <td colspan="2"><input type="text" id="dname"></td>
       
     </tr>
  </table>
</div>
<h1><b><i>Test Details</i></b></h1>
<div>
<table border="1" id="test_table">
     <tr >
       <th>Test Code</th>
       <th>Test Name</th>
       <th>Amount</th>
     </tr>
     <tr>
       <td ><input type="text" id="tcode1" onkeydown="test(1)" ></td>
       <td ><input type="text" id="tname1"></td>
       <td ><input type="text" id="rate1" ></td>
     </tr> 
     <tr>
       <td ><input type="text" id="tcode2" onkeydown="test(2)" ></td>
       <td ><input type="text" id="tname2"></td>
       <td ><input type="text" id="rate2" ></td>
     </tr> 
     
     <tr>
       <td colspan="2">Total</td>
       <td><input type="text" id="total" onfocus="calc()" ></td>
    
     </tr> 
</table>
</div>
<div id="div5">
 <input type="button" name="add" value="Add More Tests" id="add" onclick="addrows()" >
 <input type="submit" name="submit" value="Confirm Tests" >
</div>

</form>
<footer>
<%@include file="Footer.html" %>
</footer>
<script type="text/javascript" src="scripts/doctorName.js"></script>
<script type="text/javascript" src="scripts/test.js"></script>
<script type="text/javascript" src="scripts/total.js"></script>

</body>
</html>








