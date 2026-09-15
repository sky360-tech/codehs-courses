function start(){
	checkBall();
	move();
	checkBall();
	move();
	checkBall();
	move();
	checkBall();
}

function checkBall(){
	if(noBallsPresent()){
		putBall();
	}
}// reviewed: 2026-09-15
