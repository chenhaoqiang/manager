Chq.namespace('util.Html');

Chq.util.Html = function() {
};

Chq.util.Html.prototype = {
	getTextWidth : function(text) {
		var sensor = $('<pre>' + text + '</pre>').css({
			display : 'none'
		});
		$('body').append(sensor);
		var width = sensor.width();
		sensor.remove();
		return width;
	}
};