<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="org.pok.g2g.domain.*" %>
<%@ page import="org.pok.g2g.persistence.*" %>
<%@ page import="org.pok.g2g.helpers.*" %>
<%@ page import= "java.util.UUID" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	boolean test;
	Traveller t1 = new Traveller();
    t1.setName(request.getParameter("name"));
    t1.setAge(Integer.parseInt(request.getParameter("age")));
	t1.setPhoneNumber(request.getParameter("phonenumber"));
	
    if (t1.getName().trim().length() == 0 || t1.getPhone().trim().length() == 0 || t1.getAge() == 0) {
%>

You didn't fill all the fields!<br><br><br>

<%
    } else {
%>

Hello 

<%=	t1.getName()
%>
<br>
You are <%=t1.getAge() 
%> years old. Your phonenumber is <%=t1.getPhone() %>

<br><br><br> 
<%
	t1.setId(UUID.randomUUID());
	t1.saveTraveller();
    }
%>


</body>
</html>