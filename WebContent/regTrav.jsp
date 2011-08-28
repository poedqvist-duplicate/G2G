<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="org.pok.g2g.servlets.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<script type="text/javascript" src="js/regTravView.js"></script>
<link rel="stylesheet" type="text/css" href="style/reg.css" />

<script type="text/javascript">
	pageInit = function(){
		var p = new RegTravView();
		lib.init(p);
	};
</script>

<%@include file="headContent.jsp" %>
</head>
<body>
	<%@include file="bodyBegin.jsp" %>
		<h2>Registrera resen�r</h2>
			<div class="form" id="registerTraveller" style="width:50%;">
				<label for="txtName">Namn:
					<br/><span>H�r fyller du i ditt namn</span>
				</label>
				<input id="txtName" type="text" name="txtName" value="-"/>
				<br/>
				<label for="txtAge">�lder:
					<br/><span>H�r fyller du i din �lder, alternativt f�delse�r</span>
				</label>
				<input id="txtAge" type="text" name="txtAge" value="-"/>
				<br/>
				<label for="txtPhone">Telefonnummer:
					<br/><span>Fyll i ditt telefonnummer som visas f�r de du godk�nner som medresen�rer</span>
				</label>
				<input id="txtPhone" type="text" name="txtPhone" value="-"/>
				<br/>
				<label for="txtEmail">Email:
					<br/><span>Fyll i din emailadress, du kommer att anv�nda den som anv�ndarnamn vid inloggningen</span>
				</label>
				<input id="txtEmail" type="text" name="txtEmail" value="-"/>
				<br/>
				<label for="txtPassword">L�senord:
					<br/><span>Fyll i ditt telefonnummer som visas f�r de du godk�nner som medresen�rer</span>
				</label>
				<input id="txtPassword" type="password" name="txtPassword" value=""/>
				<br/>
				<div class="hiddenDiv">
					<label for="txtRepeatPassword">Upprepa ditt l�senord:
						<br/><span>Skriv in l�senordet igen</span>
					</label>
					<input id="txtRepeatPassword" type="password" name="txtRepeatPassword" value="-"/>
				</div>
			</div>
			
	<%@include file="bodyEnd.jsp" %>
</body>
</html>

