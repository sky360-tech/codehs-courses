// This program introduces the ! (not) 
// operator, which lets you take the
// opposite of a boolean value. Here
// we simulate a light switch.
function start(){
	var lightOn = true;
	println("Light on? " + lightOn);
	lightOn = !lightOn;	
	println("Light on? " + lightOn);
	lightOn = !lightOn;	
	println("Light on? " + lightOn);	
}// reviewed: 2026-09-09
