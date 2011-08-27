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
		<h2>Välkommen</h2>
		<h3>Gör alla en tjänst och res tillsammans! <br/>
		Vi vill förenkla och förbättra vardagen för människor.<br/>
		Genom att bjuda ut platser i din bil när du pendlar, eller kanske planerar en resa kan du göra både jorden och dina medmänniskor gladare</h3>
		<a href="regTrav.jsp">Registrera dig här!</a>
		<ul class="goals">
			<li>Vårt mål är att du ska inte behöva mer än 10 klick på sidan för nå det du söker</li>
			<li>Genom menyn kan du klicka dig fram till det du söker</li>
			<li>Om du vet vad du söker kan du även prova vår sökfunktion</li>
		</ul>
	<%@include file="bodyEnd.jsp" %>
</body>
</html>