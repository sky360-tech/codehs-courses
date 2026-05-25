function start() {
    turnLeft();
    moveUp();
    turnRight();
    move();
    move();
    pickBall();
    putBall();
    

}
//*this code helps Karel to move up.
function moveUp(){
    move();
    move();
    move();
    move();
}
//*this code helps Karel to pickup the ball and return to the start.
function pickBall(){
    takeBall();
    turnAround();
    move();
    move();
    turnLeft();
    move();
    move();
    move();
    move();
    turnLeft();
}