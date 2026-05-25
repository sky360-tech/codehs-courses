var LIGHT_RADIUS = 35;
var STOPLIGHT_WIDTH = 120;
var STOPLIGHT_HEIGHT = 350;
var DIST_BETWEEN_LIGHTS = 100;
var GRAY_COLOR = "#737071";

function start(){
    var centerX = getWidth() / 2;
    var centerY = getHeight() / 2;
    var rect = new Rectangle(120, 350);
    rect.setColor(GRAY_COLOR);
    rect.setPosition(centerX - 60, centerY - 175);
    add(rect);
    drawCircle(35, Color.red, centerX, centerY - 100);
    drawCircle(35, Color.yellow, centerX, centerY);
    drawCircle(35, Color.green, centerX, centerY + 100);
    
	
}
function drawCircle(radius, color, x, y){
    var circle = new Circle(radius);
    circle.setColor(color);
    circle.setPosition(x,y);
    add(circle);
}