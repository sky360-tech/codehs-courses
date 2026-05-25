function start(){
    var rolledDice = readInt("How many times you rolled the dice? ");
    var rolledDoubles = rolledDice == 2 ;
    var notRolledDoubles = readInt > 2;
    
    println("Rolled the dice twice : " + rolledDoubles + notRolledDoubles);
    
	
}