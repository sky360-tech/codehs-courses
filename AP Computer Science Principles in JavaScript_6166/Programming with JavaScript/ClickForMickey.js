// Constants for Mickey
var HEAD_RADIUS = 30;
var EAR_RADIUS = 20;
var EAR_OFFSET = HEAD_RADIUS;


/* This program draws a randomly colored Mickey
 * whenever the user clicks the mouse. */
function start(){
	mouseClickMethod(makeMickey);
}

/* This is the callback drawing function. All we do here
 * is make a call to our drawMickey function with a random
 * position and random color. 
 *
 * The parameter e describes information about the click event.
 * More specifically, e has information about the x and y location
 * of the click, and we can get access to those coordinates using
 * e.getX() and e.getY().
 */
function makeMickey(e){
	drawMickey(e.getX(), e.getY(),
                  Randomizer.nextColor());
}

/* This is a general draw circle function, which accepts any
 * radius, color, and x, y position. */
function drawCircle(radius, color, x, y){
	var circle = new Circle(radius);
	circle.setColor(color);
	circle.setPosition(x, y);
	add(circle);
}

/* This function draws a Mickey whose head is centered at position
 * (cx, cy) and whose body is determined by the color parameter.
 */
function drawMickey(cx, cy, color){
    // Head
	drawCircle(HEAD_RADIUS, color, cx, cy);
	//Left Ear
	drawCircle(EAR_RADIUS, color, cx - EAR_OFFSET, 
	    cy - EAR_OFFSET);
	//Right Ear
	drawCircle(EAR_RADIUS, color, cx + EAR_OFFSET, 
	    cy - EAR_OFFSET);
	
}