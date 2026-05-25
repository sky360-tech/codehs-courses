var SIDE_LENGTH = 100;

function start(){
    var rectWidth = getWidth() / 4;
    var rectHeight = getHeight() / 4;
    var rect = new Rectangle(rectWidth, rectHeight);
    rect.setPosition(150,150);
    rect.setColor(Randomizer.nextColor());
    add(rect);
	
}