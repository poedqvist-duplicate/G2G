<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="js/json2.js"></script>
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
<div id="kul">Ers�tt</div>
<input type="button" id="btnTest" onclick="lib.test1()" value="Klicka h�r" />
<input type="button" id="btnAjax" onclick="return false;" value="Axaj-testa" />
<input type="button" id="btnAjaxDone" onclick="return false;" value="Efter ajax" />
</body>
</html>