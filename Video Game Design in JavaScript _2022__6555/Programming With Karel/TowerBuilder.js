function start() {
    while(frontIsClear()){
        stackBalls();
        move();
        if(frontIsClear()){
            move();
        }else{
            turnRight();
        }
    }
    if (facingSouth()){
        turnLeft();
    
    }else{
        stackBalls();
    }
    

    
}
//* This helps Karel to make Tower.
function stackBalls(){
    
    turnLeft();
    putBall();
    move();
    putBall();
    move();
    putBall();
    turnAround();
    move();
    move();
    turnLeft();
    
}