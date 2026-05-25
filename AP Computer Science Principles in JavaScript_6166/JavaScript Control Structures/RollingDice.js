function start(){
    var diceOne = readInt("First Dice Roll? ");
    var diceTwo = readInt("Second Dice Roll? ");
    var rolledDoubles = diceOne == diceTwo;
    println("Got Doubles: " + rolledDoubles);
}