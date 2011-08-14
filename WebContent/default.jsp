<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="org.pok.g2g.servlets.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<!-- script type="text/javascript" src="js/json2.js"></script -->
<script type="text/javascript" src="js/jquery-1.6.2.js"></script>
<script type="text/javascript" src="js/G2GLibrary.js"></script>
<script type="text/javascript">
	var lib;
	window.onload = function(){
		lib = new G2GLibrary();
	};
</script>
</head>
<body>
	<form action="Register" method="POST" id="registerForm">
		<label for="txtName">Namn: </label>
		<input type="text" id="txtName" name="txtName" value="" />
		<br/>

		<label for="txtPhoneNumber">Telefonnummer: </label>
		<input type="text" id="txtPhoneNumber" name="txtName" value="" />
		<br/>
		
		<label for="txtAge">Ålder: </label>
		<input type="text" id="txtAge" name="txtName" value="" />
		<br/>
		
		<input type="button" value="Registrera" id="btnSend" />
	</form>
	
	<div id="added"></div>
</body>
</html>