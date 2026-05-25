/* This program draws a big tower from Karel's starting spot */
function start(){
    while (facingSouth()){
        turnAround();
    }
    while (facingWest()){
        turnRight();
    }
    while (facingEast()){
        turnLeft();
    }
    while(frontIsClear()){
        putBall();
        move();
        checkBall();
        
    }
    finish();
}
function checkBall(){
    if (ballsPresent()){
        putBall();
    }
     
   }
   function finish(){
       if(noBallsPresent()){
           putBall();
       }
   }