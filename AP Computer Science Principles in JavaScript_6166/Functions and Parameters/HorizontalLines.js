function horizontalLine(x1, y1){
	var horizontalLine = new Line( 0, x1, y1, x1);
	

    add(horizontalLine);
}

function start(){
    horizontalLine(100, 200);
    horizontalLine(200, 100);   
    horizontalLine(300, 20);
    
	

}