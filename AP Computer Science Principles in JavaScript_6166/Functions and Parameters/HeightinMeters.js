var INCHES_TO_CM = 2.54;
var CM_TO_METERS = 0.01;
var FEET_TO_INCHES = 12;

function start(){
	convertHeightToMeters(7,2);
}

function convertHeightToMeters(feet, inch){
	var total = feet * FEET_TO_INCHES * INCHES_TO_CM * CM_TO_METERS + inch * INCHES_TO_CM * CM_TO_METERS ;
	println(total);
}