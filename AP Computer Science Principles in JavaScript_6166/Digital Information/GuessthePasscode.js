/*
 * Write a program that guesses every possible 4 digit passcode
 * combinations until the correct passcode is guessed.
 *
 * The passcode is randomly generated and stored in the variable
 * secretPasscode.
 *
 * Print out how many guesses it took to guess the correct passcode.
 */
 
function start() {
    var secretPasscode = generateRandomPasscode();
    
     var i = 0;
    while(true){
        i++;

        var guess = "";

        for(var firstDigit = 0; firstDigit <= 9; firstDigit++){
            guess += firstDigit;
            for(var secondDigit = 0; secondDigit <= 9; secondDigit++){
                guess += secondDigit;
                for(var thirdDigit = 0; thirdDigit <= 9; thirdDigit++){
                    guess += thirdDigit;
                    for(var fourthDigit = 0; fourthDigit <= 9; fourthDigit++){
                        guess += fourthDigit;
                    }
                }
            }
        }
        return guess;

        if(guess == secretPasscode){
            break;
        }
        println("It took " + i + " guesses to get the correct");
    }
    
    
}

// Checks whether the given guess passcode is the correct passcode
function isCorrect(guessCode, correctCode) {
    return guessCode == correctCode;
}

// Generates a random 4 digit passcode and returns it as a String
function generateRandomPasscode() {
    var randomPasscode = "";
    
    for(var i = 0; i < 4; i++) {
        var randomDigit = Randomizer.nextInt(0, 9);
        randomPasscode += randomDigit;
    }
    
    return randomPasscode;
}