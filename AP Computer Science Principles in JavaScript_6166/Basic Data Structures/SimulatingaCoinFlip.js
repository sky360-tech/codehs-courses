var NUM_FLIPS = 10;
var RANDOM = Randomizer.nextBoolean();
var HEADS = "Heads";
var TAILS = "Tails";
function start(){
var flips = flipCoins();
printArray(flips);

function flipCoins(){
    var flips = [];
    for(var i = 0; i < NUM_FLIPS; i++){
    if(Randomizer.nextBoolean()){
    flips.push(HEADS);
    }else{
        flips.push(TAILS);
        }
    }
    return flips;
}
    function printArray(arr){
    for(var i = 0; i < arr.length; i++){
    println("Flip Number " + (i+1) + ": " + arr[i]);
    }
}// reviewed: 2026-08-22
