var NUM_FLIPS = 100;

function start(){
	var flips = flipCoins();
	printArray(flips);
}

// This function should flip a coin NUM_FLIPS
// times, and add the result to an array. We
// return the result to the caller.
function flipCoins(){
	var flips = [];
	for(var i = 0; i < NUM_FLIPS; i++){
		if(Randomizer.nextBoolean()){
			flips.push("Heads");
		}else{
			flips.push("Tails");
		}
	}
	return flips;
}

function printArray(arr){
	for(var i = 0; i < arr.length; i++){
		println(i + ": " + arr[i]);
	}
}

function longestHeadsStreak(arr){
    var storHeads = 0; // Temporarally Stores the longest streak then resets of Heads
    
    var larHeads = 0; // Holds the longest streak of heads
    
    var storTails = 0;
    
    var larTails = 0;
    for(var i = 0; i < NUM_FLIPS; i++) {
    var x = i + 1
    if(arr[i] == "Heads") {
        storHeads++
    }
    if(arr[x] != "Heads") {
        if(larHeads < storHeads) {
            var larHeads = 0;
            larHeads += storHeads;        }
        var storHeads = 0;
    }
    if(arr[i] == "Tails") {
        storTails++
    }
    if(arr[x] != "Tails") {
        if(larTails < storTails) {
            var larTails = 0;
            larTails += storTails;
        }
        var storTails = 0;
    }
  }
        println("Longest Streak of Heads: " + larHeads);
        println("Longest Streak of Tails: " + larTails);
  }