/* This program will have Karel run around the racetrack
 * 8 times. */
function start() {
    needToPutBall();
    moveForward();
    needToPutBall();
    turnLeft();
    moveForward();
    needToPutBall();
    turnLeft();
    moveForward();
    needToPutBall();
    turnLeft();
    moveForward();
    turnLeft();

    
}
function needToPutBall(){
    for (var i = 0; i < 8; i++){
        putBall();
    }
}
function moveForward(){
    while(frontIsClear()){
        move();
    }
}