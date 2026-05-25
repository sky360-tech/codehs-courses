// This code segment traverses through the array and prints the maximum 
// value.

// Challenge: Can you change this code so that the min value is printed?

function start(){
	var arr = [1, 8, 123, 103, 992, 
			   21, 2, 2, 144, 523, 
			   13, 90, 77, 12, 13];
	
	var max = arr[0]
	
	for(var i = 0; i < arr.length; i++){
		if (arr[i] > max){
		    max = arr[i];
		} 
	}
	
	println(max);
	
}