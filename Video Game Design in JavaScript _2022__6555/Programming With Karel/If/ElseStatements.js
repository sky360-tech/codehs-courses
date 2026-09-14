function start(){
	move();
	if(frontIsClear()){
		move();
	}else{
		turnLeft();
	}
}// reviewed: 2026-09-14
