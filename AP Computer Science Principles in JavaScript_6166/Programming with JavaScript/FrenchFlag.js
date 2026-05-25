function start(){
    var rectWidth = getWidth() / 3;
    var rectHeight = getHeight();

    var blueRect = new Rectangle(rectWidth, rectHeight);
    blueRect.setPosition(0, 0);
    blueRect.setColor(Color.blue);
    add(blueRect);

    var redRect = new Rectangle(rectWidth, rectHeight);
    redRect.setPosition(rectWidth * 2, 0);
    redRect.setColor(Color.red);
    add(redRect);
}