function start(){
	while(frontIsBlocked()){
	    if(frontIsBlocked()){
	        jumpHurdle();
	        
	    }
	}
	
	   if(frontIsClear()){
	    turnLeft();
	       move();
	       turnRight();
	   }
	   while(frontIsClear()){
	       move();
	   }
	   turnRight();
	   move();
	   turnLeft();
	   if(rightIsClear()){
	       turnRight();
	       move();
	       turnLeft();
	   }
	
	
	    
	
	
	    
	

    
    
    
    
    
}
function jumpHurdle(){
    turnLeft();
    move();
    turnRight();
}