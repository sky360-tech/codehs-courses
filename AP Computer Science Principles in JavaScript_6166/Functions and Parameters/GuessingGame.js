/* This program will play a simple guessing game.
 * The user will guess, and the computer should print if
 * the guess was too high, too low, or correct.
 */
function start() {
    var targetNum = Randomizer.nextInt(1, 100);
    
    var input = -1;
    while(input != targetNum){
        input = readInt("input");
        
        if(input < targetNum){
            println("Too Low");
        }else{
            if(input > targetNum){
                println("Too High");
                
            }else{
                println("Correct"); 
                
            }
        }
    }
}