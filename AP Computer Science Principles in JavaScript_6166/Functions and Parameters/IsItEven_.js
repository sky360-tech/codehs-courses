var SENTINEL = 0;


// Prints whether the entered number is even or odd
function start(){
	while(true){
	    var userInput = readInt("Number: ");

	    
	    if (userInput == SENTINEL){
	        println("Done!");
	        break;
	    }
	    if (isEven(userInput)){
	        println("Even");
	        
	    }else{
	        println("odd");
	    }
	}
	
	

}

function isEven(number){
    return (number % 2 == 0);
    
}