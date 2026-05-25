function start(){
    if(frontIsClear()){
        while(frontIsClear()){
            cleanRow();
            upRow();
            
        }
        
    }else{
        turnLeft();
        cleanRow();
        
    }
    
    goToFinish();
}
//*This Code Helps Karel To Clean All Balls In A Row.
function cleanRow(){
    while(frontIsClear()){
        if(ballsPresent()){
            takeBall();
        }
        move();
        if(ballsPresent()){
            takeBall();
        }
    }
}
//*This Code Helps Karel To Go To The Next Row.
function upRow(){
    if(facingEast()){
        turnLeft();
        if(frontIsClear()){
            move();
            turnLeft();
        }
        
        
    }else{
        if(facingWest())
            turnRight();
        if(frontIsClear()){
            move();
            turnRight();
            
                
        }
        
        
        
    }
}
function goToFinish(){
    turnAround();
    cleanRow();
    turnLeft();
    if(frontIsBlocked()){
        turnAround();
        cleanRow();
        turnAround();
        
    }
}