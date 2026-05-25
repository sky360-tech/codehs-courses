function start(){
    move();
    doubleBalls();
    move();
    takeBallsBack();
    goBack();
}
//*This code is used to make Karel double the balls.
function doubleBalls(){
    while(ballsPresent()){
        takeBall();
        move();
        putBall();
        putBall();
        turnAround();
        move();
        turnAround();
    }
}
//*This code is used to make Karel to take the balls.
function takeBallsBack(){
    while(ballsPresent()){
        takeBall();
        turnAround();
        move();
        putBall();
        turnAround();
        move();
    }
}
//*This function is used to make Karel go back to his place.
function goBack(){
    turnAround();
    move();
    move();
    turnAround();
}