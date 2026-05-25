/* This program should draw the French flag. The
 * left third of the canvas is blue, the middle third
 * is white, and the right third is red. */
function start(){
    var recWidth = getWidth() / 3;
    var recHeight = getHeight();
    
    //place my blue rectangle
    var blue = new Rectangle(recWidth, recHeight);
    blue.setPosition(0,0);
    blue.setColor(Color.blue);
    add(blue);
    
    //place my red rectangle
    var red = new Rectangle(recWidth , recHeight);
    red.setPosition(recWidth*2 , 0);
    red.setColor(Color.red);
    add(red);
	
}