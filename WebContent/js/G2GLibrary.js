/**
 * This is an example of how we could use the 
 *   Revealing Prototype Pattern
 */
var G2GLibrary = function(){
	this.init();
};

G2GLibrary.prototype = function(){

	var init = function(){		
		//$('#btnSend').die();
		//$('#btnSend').live('click', function(){
		//	registerTraveller();
		//});
		createPageLinks();
	},
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