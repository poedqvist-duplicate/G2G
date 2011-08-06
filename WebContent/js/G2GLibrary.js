/**
 * This is an example of how we could use the 
 *   Revealing Prototype Pattern
 */
var G2GLibrary = function(){
	this.init();
};

G2GLibrary.prototype = function(){
	var init = function(){
		$('#btnTest').die();
		$('#btnTest').live('click', function(){
			alert('nytt sätt');
		});
	},
	test = function() {
		alert('En annan funtktion... \n Coolt va?');
	};/*,
	ajaxTest = function(){
	};
	*/
	
	
	return {
		init:init,
		test:test
	};
}();