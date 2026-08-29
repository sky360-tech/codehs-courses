var NUM_CIRCLES = 15;

// This graphics program should draw a caterpillar. A caterpillar has NUM_CIRCLES
// circles. Every other circle is a different color, the even circles are red, and
// the odd circles are green. Use a for loop to draw the caterpillar, centered 
// vertically in the screen.
function start(){
    for(var i = 0; i < 15; i++){
    var circle = new Circle(NUM_CIRCLES);
    if (i % 2 == 0) {
    circle.setPosition(i, 200);
    circle.setColor(Color.red);
    add(circle);
    } else {
    circle.setPosition(i, 200);
    circle.setColor(Color.green);
    add(circle);
  }
    }	
}// reviewed: 2026-08-29
