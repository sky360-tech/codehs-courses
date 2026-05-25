//In this function Karel is going to build two tennis ball towers.
function start(){
    move();
    turnLeft();
    moveForward();
    turnRight();
    move();
    turnRight();
    moveDown();
    move();
    turnLeft();
    moveForward();
    turnRight();
}
//In this function Karel puts ball and move forward
function moveForward(){
    putBall();
    move();
    putBall();
    move();
    putBall();
    move();
    
}
//this function is used to make Karel turn right
function turnRight(){
    turnLeft();
    turnLeft();
    turnLeft();
}
//this function is used to make Karel move down
function moveDown(){
    move();
    move();
    move();
    turnLeft();
    
}