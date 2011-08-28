var RegTravView = function(){
	//this.init();
};

RegTravView.prototype = function(){
	var init = function(){
		//initBtnPos();
		alert('btw this works ! WOWOW');
		var btnHtml =   '<div style="width:50%;height:10px;float:left;">'
						+ '<input class="button" style="float:right;margin-right:5%;" type="button" value="Registrera" id="btnRegister" />'
						+ '</div>';
		$('#registerTraveller').after(btnHtml);
		/*
		//Mouse and key-bindings
		$('#btnRegister').die();
		$('#btnRegister').live('click', function(){
			registerTraveller();
		});
		
		$('#txtPassword').unbind();
		$('#txtPassword').bind('focusout', function(event){
			alert('hej');
			doubleCheckPassword(event);
		});*/
		
	},
	registerTraveller = function(){
		//Collect form-data
		var data = {
				Name: $('#txtName').val(),
				PhoneNumber: $('#txtName').val(),
				Name: $('#txtName').val(),
				Name: $('#txtName').val(),
				Name: $('#txtName').val(),
				Name: $('#txtName').val(),	
		};
		$.ajax({
			   type: "POST", 	//What method we want to use eg. POST/GET
			   url: "TravellerRegistrationHandler",	//The URL wich we are posting the data to
			   dataType: "json",//What kind of information will we get back?
			   data: data,	// Pass the collected data to the servlet
			   success: function(journey){
				   
			   },
			   err: function(err){
				   alert(err);
			   }});
	};
	
	
	return 	{init : init};
}();