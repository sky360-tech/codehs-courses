var N = 5;

function start(){
    var MIN = 4;
    var MAX = 15;

    var product = 4;
    for(var i = MIN; i <= MAX;i++){
    product *= i;
    }
    println("The product was " + product);
}