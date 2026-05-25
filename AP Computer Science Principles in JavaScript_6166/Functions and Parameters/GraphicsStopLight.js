var LIGHT_RADIUS = 35;
var STOPLIGHT_WIDTH = 120;
var STOPLIGHT_HEIGHT = 350;
var BUFFER = 100;
var GRAY_COLOR = "#737071";

 function start(){
    drawRectangle(STOPLIGHT_WIDTH, STOPLIGHT_HEIGHT, GRAY_COLOR);
	var centerX = getWidth() / 2;
    var centerY = getHeight() / 2;
    drawCircle("red", LIGHT_RADIUS, centerX, centerY - BUFFER);
    drawCircle("yellow", LIGHT_RADIUS, centerX, centerY);
    drawCircle("green", LIGHT_RADIUS, centerX, centerY + BUFFER);

}
 function drawCircle(color, radius, x, y){
	var circle = new Circle(radius);
    circle.setPosition(x, y);
    circle.setColor(color);
    add(circle);

}
 function drawRectangle(width, height, color);
{
    var rect = new Rectangle(width, height);
    rect.setPosition((getWidth() - width) / 2, (getHeight() - height) / 2); // Center the rectangle
    rect.setColor(color);
    add(rect);
}