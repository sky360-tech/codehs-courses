function start(){
    var numberOne = readInt("pick the first number to add.");
    var numberTwo = readInt("pick the second number to add.");
    var sum = 0;
    for(var i = numberOne; i <= numberTwo; i++){
        sum += i;
        
    }
    println("The sum was " + sum);}// reviewed: 2026-09-05
