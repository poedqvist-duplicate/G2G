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
<form action="JourneyRegistration" method="POST" id="JourneyregisterForm">
		<label for="txtOriginL">Utgångspunkt latitud: </label>
		<input type="text" id="txtoLatitude" name="txtoLatitude" value="" />
		<br/>

		<label for="txtOriginA">Utgångspunkt altitud: </label>
		<input type="text" id="txtoAltitude" name="txtoAltitude" value="" />
		<br/>
		
		<label for="txtOriginR">Utgångspunkt radie: </label>
		<input type="text" id="txtoRadius" name="txtoRadius" value="" />
		<br/>
		
		<label for="txtDestinationL">Slutdestination latitud: </label>
		<input type="text" id="txtdLatitude" name="txtdLatitude" value="" />
		<br/>

		<label for="txtDestinationA">Slutdestination altitud: </label>
		<input type="text" id="txtdAltitude" name="txtdAltitude" value="" />
		<br/>
		
		<label for="txtDestinationR">Slutdestination radie: </label>
		<input type="text" id="txtdRadius" name="txtdRadius" value="" />
		<br/>
		
		<label for="txtamountOfPassengers">Sökt antal passagerare: </label>
		<input type="text" id="txtamountOfPassengers" name="txtamountOfPassengers" value="" />
		<br/>
		
		<label for="txtDescription">Beskrivning av resa: </label>
		<input type="text" id="txtDescription" name="txtDescription" value="" />
		<br/>
		
		<input type="button" value="Registrera" id="btnSendToJReg" />
	</form>
	
	<div id="added"></div>

</body>
</html>