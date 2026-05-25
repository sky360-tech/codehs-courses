// Traversing  (looping through) a list can be a complete traversal, where 
// all elements in the list are accessed, or a partial traversal, where 
// only a portion of elements are accessed. 
	
function start(){
	
	var list = ["bread", "eggs", "milk", "cookies", "bananas", "tuna", "lettuce", "yogurt", "cheese", "chicken", "cucumbers", "orange juice", 'lime, potatoes'];
	
	// Prints the first 5 items in the list
	
	for(var i = 0; i < 5; i++){
		println(list[i]);
	}

    // Prints the first half of the list
	
	for(var i = 0; i < list.length/2; i++){
		println(list[i]);
	}
	
}