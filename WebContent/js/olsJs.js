
/*USED TO REGISTER A TRAVELLER*/

registerTraveller = function(){
	//Collect the data from the fields
	var formData = {
			"Name" : $('#txtName').val(),
			"PhoneNumber" : $('#txtPhoneNumber').val(),
			"Age" : $('#txtAge').val()
	};
	
	//Send AsynchronJavascriptAndXML
	// 		(XMLHttpRequest) a.k.a. AJAX
	$.ajax({
		   type: "POST", 	//What method we want to use eg. POST/GET
		   url: "Register",	//The URL wich we are posting the data to
		   dataType: "json",//What kind of information will we get back?
		   data: formData,	// Pass the collected data to the servlet
		   success: function(traveller){	//The main success scenario
			   var tHtml = '';
			   tHtml += '<table>'
				     +    '<th>'
				     +      '<tr>'
				     +        '<td>Attribut:</td>'
				     +        '<td>Värde:</td>'
				     +      '</tr>'
				     +    '</th>'
				     +    '<tb>'
				     +      '<tr>'
				     +        '<td>Namn:</td>'
				     +        '<td>' + traveller.traveller.Name + '</td>'
				     +      '</tr>'
				     +      '<tr>'
				     +        '<td>Id:</td>'
				     +        '<td>' + traveller.traveller.Id + '</td>'
				     +      '</tr>'
				     +      '<tr>'
				     +        '<td>PhoneNumber:</td>'
				     +        '<td>' + traveller.traveller.PhoneNumber + '</td>'
				     +      '</tr>'
				     +      '<tr>'
				     +        '<td>Ålder:</td>'
				     +        '<td>' + traveller.traveller.Age + '</td>'
				     +      '</tr>'
				     +    '</tb>'
				     +  '</table>';
			   
			   //$('#registerForm').after(tHtml);
			   $('#added').html(tHtml);
		   },
		   error:function(err){
			   alert(err);
		   }
		 });
};
