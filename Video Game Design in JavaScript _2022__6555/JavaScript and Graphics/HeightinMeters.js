var INCHES_TO_CM = 2.54;
var CM_TO_METERS = 0.01;
var FEET_TO_INCHES = 12;

function start(){
    convertHeightToMeters(6,4);
	
}

function convertHeightToMeters(x,y){
    var feetToInches = x * 12;
    var inchesToCm = feetToInches * 2.54;
    var cmToMeters = inchesToCm * 0.01;
    var inchesToCm2 = y * 2.54;
    var cmToMeters2 = inchesToCm2 * 0.01;
    var heightInMeters = cmToMeters + cmToMeters2;
    println(heightInMeters);
}