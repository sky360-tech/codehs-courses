function start(){
	move();
	turnLeft();
	moveForward();
	turnRight();
	move();
	moveDown();
	turnLeft();
	move();
	turnLeft();
	moveForward();
	turnRight();
	
	
	
}
function moveForward(){
    putBall();
    move();
    putBall();
    move();
    putBall();
    move();
}
function turnRight(){
    turnLeft();
    turnLeft();
    turnLeft();
}
function moveDown(){
    turnLeft();
    turnLeft();
    turnLeft();
    move();
    move();
    move();
}