const Randomizer = {
    nextInt: function(low, high) {
        return Math.floor(Math.random() * (high - low + 1)) + low;
    }
};

function rollDiceUntilSnakeEyes() {
    let rollCount = 0;

    while (true) {  
        
        const rollOne = Randomizer.nextInt(1, 6);
        const rollTwo = Randomizer.nextInt(1, 6);
        rollCount++;

        
        println("Rolled: " + rollOne + " " + rollTwo);

        
        if (rollOne === 1 && rollTwo === 1) {
            break;  
        }
    }

    println("It took you " + rollCount + " rolls to get snake eyes.");
}

rollDiceUntilSnakeEyes();