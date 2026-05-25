function indexOf(arr, str){
	for(var i = 0; i < arr.length; i++){
		var cur = arr[i];
		if(cur == str){
			return i;
		}
	}
	return -1;
}



function start(){
	var line = ["Sam", "Lisa", "Laurie", "Bob", "Ryan"];
	var line2 = ["Tony", "Lisa", "Laurie", "Karen"];
	// Your code goes here
	
	var idx = indexOf(line, "Bob");

	var idx2 = indexOf(line2,"Bob");
	
	
	if(idx > -1){
	    println("Bob is in the first line.");
	}
	
	if(idx2 == -1){
	    println("Bob is not in the second line.");
	}

	
}