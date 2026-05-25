// Karel should put a ball on the first spot
// if there isn't one already there and then move.
function start() {
    safeTakeBall();
    putBall();
    move();
    
	
}
function safeTakeBall(){
    if (ballsPresent()){
        takeBall();
    }
}