function start(){
	var numRolls = 0;
	while(true){
	    numRolls++;
	    var diceOne = Randomizer.nextInt(1,6);
	    var diceTwo = Randomizer.nextInt(1,6);
	    println("Rolled: " + diceOne+ ", " + diceTwo);
	    if(diceOne == 1 && diceTwo == 1){
	        break;
	    }
}
   println("It took you " + numRolls+ " to get a snake eyes.");










}