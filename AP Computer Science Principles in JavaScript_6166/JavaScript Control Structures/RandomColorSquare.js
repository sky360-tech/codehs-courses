var SIDE_LENGTH = 100;

function start(){
    var rect = new Rectangle(100,50);
    rect.setPosition = Randomizer.nextInt(60,150);
    rect.setColor = Randomizer.nextColor();
    add(rect);
}