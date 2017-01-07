var Chq = {};
Chq.namespace = function(name) {
	var parts = name.split('.');
	var current = Chq;
	for ( var i in parts) {
		if (!current[parts[i]]) {
			current[parts[i]] = {};
		}
		current = current[parts[i]];
	}
};