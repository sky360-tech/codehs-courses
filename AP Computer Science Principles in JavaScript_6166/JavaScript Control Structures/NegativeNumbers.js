// This program reads a number from the
// user and prints if it is negative.

function start(){
	var number = readInt("Number: ");
	if(number < 0){
		println("Number is negative.");
	}
}

// This works as a boolean as well! Remove or comment out 
// the above code segment and uncomment this section below
// Does it still work?


// function start(){
// 	var number = readInt("Number: ");
// 	var negative = number < 0;
// 	println("Number is negative: " + negative);
// }