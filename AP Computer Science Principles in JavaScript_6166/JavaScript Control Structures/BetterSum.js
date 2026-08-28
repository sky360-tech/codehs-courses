var MIN = readInt("What is the minimum number?");
var MAX = readInt("What is the maximum number?");

function start(){
    var sum = 0;
    for(var i = MIN; i <= MAX; i++){
    sum += i;
    }

    println("The sum was " + sum);
}// reviewed: 2026-08-28
