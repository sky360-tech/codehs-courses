var NUM_CIRCLES = 15;

// This graphics program should draw a caterpillar. A caterpillar has NUM_CIRCLES
// circles. Every other circle is a different color, the even circles are red, and
// the odd circles are green. Use a for loop to draw the caterpillar, centered 
// vertically in the screen.
function start(){
    for(var i = 0; i < 8; i++){
        var circle = new Circle(15);
        circle.setPosition(15, 200);
        circle.setColor("red");
        add(circle);
        

    }
    for(var i = 0; i < 7; i++){
        var circle = new Circle(15);
        circle.setPosition(45, 200);
        circle.setColor("green");
        add(circle);
    }
}// reviewed: 2026-09-06
