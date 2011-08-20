<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="org.pok.g2g.servlets.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registrera resenär</title>
<link rel="stylesheet" type="text/css" href="style/g2g.css" />
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
	<div class="content">
		<div class="headContent"><h1>gO2gether</h1></div>
		<div class="mainContent">
			<div id="map"><img src="img/map.png" alt="Sverige-karta" title="Sverige-karta"/></div>
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
		</div>
		<div class="menuContent"><ul id="menuList"></ul></div>
	</div>
</body>
</html>