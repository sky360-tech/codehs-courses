// Constants for main ghost body
var HEAD_RADIUS = 35;
var BODY_WIDTH = HEAD_RADIUS * 2;
var BODY_HEIGHT = 60;
var NUM_FEET = 3;
var FOOT_RADIUS = (BODY_WIDTH) / (NUM_FEET * 2); 

// Constants for eyes
var PUPIL_RADIUS = 4;
var PUPIL_LEFT_OFFSET = 8;
var PUPIL_RIGHT_OFFSET = 20;
var EYE_RADIUS = 10;
var EYE_OFFSET = 14;

/* Write a comment here about your overall program */
function start(){
	// Add your code and your own functions
	var centerX = getWidth()/2;
    var centerY = getHeight()/2;
    drawGhost(centerX, centerY, Color.red);
    drawGhost(100,100, Color.green);
    drawGhost(300, 200, Color.black);
    drawGhost(40, 300, Color.orange);
    drawGhost(300, 50, Color.yellow);
}


function radius() {
    var radius = 0;
}

function drawGhost(centerX, centerY, color){
    var rect = new Rectangle(70, 60);
    rect.setPosition(centerX, centerY);
    rect.setColor(color);
    add(rect);
    
    var circle = new Circle(35);
    var head = centerX + 35;
    circle.setPosition(head, centerY);
    circle.setColor(color);
    add(circle);
    
    var circle = new Circle(10);
    var eye = centerX + 20;
    circle.setPosition(eye, centerY);
    circle.setColor("white");
    add(circle);
    
    var circle = new Circle(10);
    var eye = centerX + 45;
    circle.setPosition(eye, centerY);
    circle.setColor("white");
    add(circle);
    
    var circle = new Circle(4);
    var eye = centerX + 50;
    circle.setPosition(eye, centerY);
    circle.setColor("BLUE");
    add(circle);
    
    var circle = new Circle(4);
    var eye = centerX + 25;
    circle.setPosition(eye, centerY);
    circle.setColor("BLUE");
    add(circle);
    
    var circle = new Circle(11);
    var foot2 = centerY + 60;
    var foot = centerX + 11;
    circle.setPosition(foot , foot2 );
    circle.setColor(color);
    add(circle);
    
     var circle = new Circle(12);
    var foot2 = centerY + 60;
    var foot = centerX + 35;
    circle.setPosition(foot , foot2 );
    circle.setColor(color);
    add(circle);
    
     var circle = new Circle(12);
    var foot2 = centerY + 60;
    var foot = centerX + 58;
    circle.setPosition(foot , foot2 );
    circle.setColor(color);
    add(circle);
    
    
}// reviewed: 2026-08-26
