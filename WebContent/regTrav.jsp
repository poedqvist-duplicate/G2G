<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="org.pok.g2g.servlets.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@include file="headContent.jsp" %>
</head>
<body>
	<%@include file="bodyBegin.jsp" %>
		<h2>Registrera resenär</h2>
			<div id="registerTraveller" style="width:50%;">
				<label for="txtName">Namn:</label>
				<input id="txtName" type="text" name="txtName" value="-"/>
				<br/>
				<label for="txtName">Ålder:</label>
				<input id="txtName" type="text" name="txtName" value="-"/>
				<br/>
				<label for="txtName">Telefonnummer:</label>
				<input id="txtName" type="text" name="txtName" value="-"/>
				
				<input type="button" value="Registrera" id="btnSend" />
			</div>
	<%@include file="bodyEnd.jsp" %>
</body>
</html>

