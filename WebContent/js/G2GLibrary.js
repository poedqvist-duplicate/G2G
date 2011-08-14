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
	},
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
				   alert('nu händer det grejer');
			   },
			   error:function(err){
				   alert(err);
			   }
			 });

		alert('Skickat klart');
	};
	
	
	return {
		init:init
	};
}();