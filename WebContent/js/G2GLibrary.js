/**
 * This is an example of how we could use the 
 *   Revealing Prototype Pattern
 */
var G2GLibrary = function(){
	this.init();
};

G2GLibrary.prototype = function(){

	var init = function(){		

		$('#btnSend').die();
		$('#btnSend').live('click', function(){
			registerTraveller();
		});
		
		$('#btnSendToJReg').die();
		$('#btnSendToJReg').live('click', function(){
			registerJourney();
		});

		createPageLinks();
	
	registerJourney = function(){
		var JRegFormData = {
				"oLatitude" : $('#txtoLatitude').val(),
				"oAltitude" : $('#txtoAltitude').val(),
				"oRadius"	: $('#txtoRadius').val(),
				"dLatitude" : $('#txtdLatitude').val(),
				"dAltitude" : $('#txtdAltitude').val(),
				"dRadius"	: $('#txtdRadius').val(),
				"amountOfPassengers" : $('#txtamountOfPassengers').val(),
				"jDescription" : $('#txtDescription').val()
		};
	
		//Send AsynchronJavascriptAndXML
		// 		(XMLHttpRequest) a.k.a. AJAX
		$.ajax({
			   type: "POST", 	//What method we want to use eg. POST/GET
			   url: "JourneyRegistrationHandler",	//The URL wich we are posting the data to
			   dataType: "json",//What kind of information will we get back?
			   data: JRegFormData,	// Pass the collected data to the servlet
			   success: function(journey){	//The main success scenario
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
					     +        '<td>Utgångspunkt:</td>'
					     +        '<td>' + journey.journey.Origin + '</td>'
					     +      '</tr>'
					     +      '<tr>'
					     +        '<td>Destination:</td>'
					     +        '<td>' + journey.journey.Destination + '</td>'
					     +      '</tr>'
					     +      '<tr>'
					     +        '<td>Antal passagerare:</td>'
					     +        '<td>' + journey.journey.AmountOfPassengers + '</td>'
					     +      '</tr>'
					     +      '<tr>'
					     +        '<td>Beskrivning:</td>'
					     +        '<td>' + journey.journey.Description + '</td>'
					     +      '</tr>'
					     +      '<tr>'
					     +        '<td>id:</td>'
					     +        '<td>' + journey.journey.journeyId + '</td>'
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
	},
	
	registerTraveller = function(){
		//Collect the data from the fields
		var formData = {
				"Name" : $('#txtName').val(),
				"PhoneNumber" : $('#txtPhoneNumber').val(),
				"Age" : $('#txtAge').val()
		};

	createPageLinks = function(){
		var html = '';
		function linkTo(linkName, linkHref){
			html += '<li><a href="' + linkHref + '">' + linkName + '</a></li>';
		}
		linkTo("Hem", "default.jsp");
		linkTo("Registrera resenär", "regTrav.jsp");
		linkTo("Registrera resa", "regJourney.jsp");
		linkTo("Om gO2gether", "about.jsp");

		
		$('#menuList').html(html);
	};
	
	return {
		init:init
	};
}();
}
}
