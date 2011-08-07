/**
 * This is an example of how we could use the 
 *   Revealing Prototype Pattern
 */
var G2GLibrary = function(){
	this.init();
};

G2GLibrary.prototype = function(){
	var t;
	
	var init = function(){
		$('#btnAjax').die();
		$('#btnAjax').live('click', function(){
			ajaxTest();
		});
		$('#btnAjax').live('mouseover', function(event){
			$(this).css("background-color", "#FF0033");
		});
		
		$('#btnAjaxDone').die();
		$('#btnAjaxDone').live('click', function(){
			changeDiv();
		});
	},
	test = function() {
		alert('En annan funtktion... \n Coolt va?');
	},
	ajaxTest = function(){
		$.ajax({
			   type: "POST",
			   url: "Tester",
			   dataType: "json",
			   data: "name=John&location=Boston",
			   success: function(traveller){
				   t = traveller;
			     //alert( "Meddelande: " + traveller.name );
			     //alert( "Tester: " + traveller.journey);
			     //alert( "Tester: " + traveller.journey.destination);
			   }
			 });
	},
	changeDiv = function(){
		var tmpHtml = '<p id="ptag">';
		tmpHtml += 'Vi �r p� v�g till: ' + t.journey.destination;
		tmpHtml += '</p> <br/>' + 'S� h�r ser text ut ox�';
		
		$('#kul').html(tmpHtml);
		$('#ptag').css("background-color", "#33333F");
	};
	
	
	
	return {
		init:init,
		test1:test
	};
}();