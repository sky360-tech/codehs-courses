function start(){
	var numApples = 4;
	println("Before: " + numApples);
	var twiceAsMany = doubleNumber(numApples);
	println("After: " + twiceAsMany);
	
	var y = 11;
	println(doubleNumber(y));
}

function doubleNumber(x){
	var doubledX = 2 * x;
	return doubledX;
}